package linguanova.worker;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import java.awt.Desktop;
import java.net.URI;

import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import linguanova.LinguaNovaBaseListener;
import linguanova.LinguaNovaParser;

public class JavaScriptWorker extends LinguaNovaBaseListener implements IWorker {
	
	private Queue<String> js = new LinkedList<String>();
	private StringBuilder javascript;
	private STGroup stg;
	private ST st;
	private String indent = "   ";
	private int indent_lv = 0;
	
	public JavaScriptWorker() throws Exception {
		stg = new STGroupFile("./linguanova_template.stg");
		javascript = new StringBuilder();
		WalkTree(this, GetParser().prog());
		
		for(String script : js) {
			javascript.append(script + "\n");
		}
		
		System.out.println(javascript);
		
		try (PrintWriter out = new PrintWriter("yourprogram.js")) {
			out.print(javascript.toString());
			if (Desktop.isDesktopSupported()) {
			    Desktop.getDesktop().browse(new URI("yourprogram.html"));
			}
		}
	}
	
	@Override
	public void enterStatic_assignments(LinguaNovaParser.Static_assignmentsContext ctx) {	
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("globalVariable");
		st.add("v", values.get(2).getChild(0).getText());
		st.add("value", values.get(3).getChild(1).getChild(0).getText());
		js.add(st.render() + GetTerminator());
	}

	@Override
	public void enterMain_body(LinguaNovaParser.Main_bodyContext ctx) {
		st = stg.getInstanceOf("enterMain_body");
		js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitMain_body(LinguaNovaParser.Main_bodyContext ctx) {
		--indent_lv;
		st = stg.getInstanceOf("exit_block");
		js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterVar_dec(LinguaNovaParser.Var_decContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("localVariable");
		st.add("v", values.get(2).getChild(0).getText());
		
		if(ctx.getChild(3) != null) {
			if(!values.get(3).getChild(1).getChild(0).getClass().getSimpleName().equals("Math_opContext"))
				st.add("value", " = " + GetString(values.get(3).getChild(1)));
			else
				st.add("value", " = " + GetMaths(values.get(3).getChild(1).getChild(0)));
		} // check if an assignment exists
        js.add(GetIndentation() + st.render() + GetTerminator());
	}
	
	@Override
	public void enterFunc_call(LinguaNovaParser.Func_callContext ctx) {
		List<ParseTree> values = ctx.children;
		
		if(!values.get(3).getParent().getParent().getClass().getSimpleName().equals("Math_opContext")) {
			st = stg.getInstanceOf("funcCall");
			st.add("v", values.get(1).getText());
			if(!values.get(3).getClass().getSimpleName().equals("TerminalNodeImpl")) {
				if(values.get(3).getChild(0).getClass().getSimpleName().equals("Math_opContext"))
					st.add("arg", GetMaths(values.get(3).getChild(0)));
				else
					st.add("arg", GetString(values.get(3)));
			}
			else
				st.add("arg", null);       
			
			if(ctx.getParent().getParent().getClass().getSimpleName().equals("AssignmentContext"))
				js.add(st.render() + GetTerminator());
			else if(ctx.getParent().getParent().getClass().getSimpleName().equals("Negate_opContext"))
				js.add("!" + st.render() + GetTerminator());
			else
				js.add(GetIndentation() + st.render() + GetTerminator());
		} // suppress Func_call to reappear after the argument list
	}
		
	@Override
	public void enterInput(LinguaNovaParser.InputContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("input");
		st.add("v", values.get(1).getText());
		
        js.add(GetIndentation() + st.render() + GetTerminator());
	}

	@Override
	public void enterOutput(LinguaNovaParser.OutputContext ctx) {
		List<ParseTree> values = ctx.children;
		ArrayList<String> valueNames = new ArrayList<String>();

		for(int i = 1; i < values.size(); i += 2) {
			valueNames.add(GetString(values.get(i)));			
		}
				
		st = stg.getInstanceOf("output");
		st.add("v", valueNames);
        js.add(GetIndentation() + st.render() + GetTerminator());
	}
	
	@Override
	public void enterFunc_body(LinguaNovaParser.Func_bodyContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("enterFunction");
		st.add("v", values.get(2).getText());
		
		if(!values.get(5).getClass().getSimpleName().equals("TerminalNodeImpl")) {
			if(!values.get(5).getClass().getSimpleName().equals("Array_containerContext"))
				st.add("arg", values.get(5).getText());
			else
				st.add("arg", values.get(6).getText());
		}
		else
			st.add("arg", null);
		
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitFunc_body(LinguaNovaParser.Func_bodyContext ctx) {
		--indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterSwitchCase(LinguaNovaParser.SwitchCaseContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("enterSwitch");
		st.add("v", values.get(1).getText());
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void enterSCase(LinguaNovaParser.SCaseContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("enterCase");
		st.add("v", values.get(1).getText());
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void enterSDefault(LinguaNovaParser.SDefaultContext ctx) {
		st = stg.getInstanceOf("enterDefault");
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitSDefault(LinguaNovaParser.SDefaultContext ctx) {
		st = stg.getInstanceOf("exitCase");
        js.add(GetIndentation() + st.render());
        --indent_lv;
	}
	
	@Override
	public void exitSCase(LinguaNovaParser.SCaseContext ctx) {
		st = stg.getInstanceOf("exitCase");
        js.add(GetIndentation() + st.render());
        --indent_lv;
	}
	
	public void exitSwitchCase(LinguaNovaParser.SwitchCaseContext ctx) {
		--indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterIf_stmt(LinguaNovaParser.If_stmtContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("ifStmt");
		st.add("cond", GetCond(values.get(1).getChild(0)));
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitIf_stmt(LinguaNovaParser.If_stmtContext ctx) {
        --indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterElse_stmt(LinguaNovaParser.Else_stmtContext ctx) {
		st = stg.getInstanceOf("elseStmt");
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitElse_stmt(LinguaNovaParser.Else_stmtContext ctx) {
        --indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterWhile_loop(LinguaNovaParser.While_loopContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("while");
		st.add("cond", GetCond(values.get(1).getChild(0)));
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitWhile_loop(LinguaNovaParser.While_loopContext ctx) {
        --indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	public void enterDo_while(LinguaNovaParser.Do_whileContext ctx) {
		st = stg.getInstanceOf("do");
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitDo_while(LinguaNovaParser.Do_whileContext ctx) {
		List<ParseTree> values = ctx.children;
		
		--indent_lv;
		st = stg.getInstanceOf("dowhile");
		st.add("cond", GetCond(values.get(7).getChild(0)));
        js.add(GetIndentation() + st.render());
	}
	
	
	@Override
	public void enterFor_loop(LinguaNovaParser.For_loopContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("for");
		st.add("v", values.get(1).getText());
		st.add("i", values.get(3).getText());
		st.add("cond", GetCond(values.get(5)));
		st.add("t", GetMaths(values.get(7)));
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitFor_loop(LinguaNovaParser.For_loopContext ctx) {
        --indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterForeach_loop(LinguaNovaParser.Foreach_loopContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("foreach");
		st.add("v", values.get(2).getText());
		st.add("a", values.get(4).getText());
        js.add(GetIndentation() + st.render());
        ++indent_lv;
	}
	
	@Override
	public void exitForeach_loop(LinguaNovaParser.Foreach_loopContext ctx) {
        --indent_lv;
		st = stg.getInstanceOf("exit_block");
        js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void enterVar_assign(LinguaNovaParser.Var_assignContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("assignVariable");
		st.add("v", values.get(0).getChild(0).getText());
		
		if(ctx.getChild(1) != null) {
			if(values.get(1).getChild(1).getChild(0).getClass().getSimpleName().equals("Math_opContext"))
				st.add("value", " = " + GetMaths(values.get(1).getChild(1).getChild(0)));
			else if(values.get(1).getChild(1).getChild(0).getClass().getSimpleName().equals("Func_callContext"))
				st.add("value", " = ");
			else
				st.add("value", " = " + values.get(1).getChild(1).getText());
		}
		// check if an assignment exists
		
		if(!values.get(1).getChild(1).getChild(0).getClass().getSimpleName().equals("Func_callContext"))
			js.add(GetIndentation() + st.render() + GetTerminator());
		else
			js.add(GetIndentation() + st.render());
	}
	
	@Override
	public void exitVar_assign(LinguaNovaParser.Var_assignContext ctx) {
        js.add(GetIndentation());
	}
	
	@Override
	public void enterRtn(LinguaNovaParser.RtnContext ctx) {
		List<ParseTree> values = ctx.children;
		
		st = stg.getInstanceOf("return");
		if(values.get(1).getChild(0).getClass().getSimpleName().equals("Math_opContext"))
			st.add("v", GetMaths(values.get(1).getChild(0)));
		else {
			switch(values.get(1).getClass().getSimpleName()) {
			case "ConditionContext":
				st.add("v", GetCond(values.get(1).getChild(0)));
				break;
			default:
				st.add("v", GetString(values.get(1)));
				break;
			}
		}
		
		if(ctx.getChild(1).getChild(0).getClass().getSimpleName().equals("Negate_opContext"))
			js.add(GetIndentation() + st.render());
		else
			js.add(GetIndentation() + st.render() + GetTerminator());
	}
	
	private String GetString(ParseTree t) {
		StringBuilder s = new StringBuilder();
		if(t.getClass().getSimpleName().equals("Array_lengthContext")) {
			s.append(t.getChild(2).getText() + "." + t.getChild(0).getText());
		}
		else {
			for(int i = 0; i < t.getChildCount(); i++) {
				switch(t.getChild(i).getText()) {
				case "call":
					break;
				case "(":
					s.append("(");
					break;
				case "<":
					s.append("[");	
					break;
				case ",":
					s.append(", ");	
					break;
				case ">":
					s.append("]");	
					break;
				case ")":
					s.append(")");
					break;
				default:
					if(t.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
						if(Character.isLetter(t.getChild(i).getText().charAt(t.getChild(i).getText().length()-1)))
							s.append(t.getChild(i).getText() + " ");
						else
							s.append(t.getChild(i).getText());
								
					}
					else
						s.append(GetString(t.getChild(i)));
					break;
				}
			}
		}
		return s.toString();
	} // construct a variable/array if available
	
	private String GetMaths(ParseTree t) {
		StringBuilder s = new StringBuilder();
		if(t.getChild(0).getText().equals("power")) {
			s.append("Math.pow(" +
						t.getChild(2).getText() + ", "
						+ t.getChild(4).getText() + ")"
			);
		} // raise number to the power of x
		else if(t.getChild(0).getText().equals("inc") || t.getChild(0).getText().equals("dec")) {
			s.append(t.getChild(2).getText());
			s.append(GetMathsSymbol(t));
		} // get inc-/decrementor
		else {
			s.append(GetMathsContent(t, 2));
			s.append(GetMathsSymbol(t));
			s.append(GetMathsContent(t, 4));
		} // get mathematical operation
		return s.toString();
	} // construct a mathematical operation if available
	
	private String GetCond(ParseTree t) {
		StringBuilder s = new StringBuilder();
		if(t.getChild(0).getText().equals("negate")) {
			s.append(GetNegate(t));
		}
		else {
			s.append(GetCondContent(t, 2));
			s.append(GetCompSymbol(t));
			s.append(GetCondContent(t, 4));
		}
		return s.toString();
	} // construct a condition if available
	
	private String GetNegate(ParseTree t) {
		StringBuilder s = new StringBuilder();
		if(t.getParent().getClass().getSimpleName().equals("ConditionContext")) {
			if(t.getChild(2).getChild(0).getClass().getSimpleName().equals("Equals_opContext")) {
				s.append("(" + t.getChild(2).getChild(0).getChild(2).getText());
				s.append(" != ");
				s.append(t.getChild(2).getChild(0).getChild(4).getText() + ")");
			} // get not equal as conditional argument 
		}
		else {
			s.append("!");
			if((!t.getChild(2).getChild(0).getClass().getSimpleName().equals("Func_callContext"))) {
				if(t.getChild(2).getClass().getSimpleName().equals("ConditionContext"))
					s.append("(" + GetCond(t.getChild(2).getChild(0)) + ")");
				else
					s.append("(" + GetString(t.getChild(2).getChild(0)) + ")");
			}
		}
		
		return s.toString();
	}
	
	private String GetMathsContent(ParseTree t, int i) {
		if(t.getChild(i).getClass().getSimpleName().equals("Math_opContext"))
			return "(" + GetMaths(t.getChild(i)) + ")";
		else if(t.getChild(i).getClass().getSimpleName().equals("Func_callContext"))
			return "(" + GetString(t.getChild(i)) + ")";
		else
			return t.getChild(i).getText();
	}
	
	private String GetCondContent(ParseTree t, int i) {
		if(t.getChild(i).getChild(0).getClass().getSimpleName().equals("Array_lengthContext"))
			return GetString(t.getChild(i).getChild(0));
		else if(t.getChild(i).getChild(0).getClass().getSimpleName().equals("Comparison_opContext"))
			return "(" + GetCond(t.getChild(i).getChild(0)) + ")";
		else if(t.getChild(i).getChild(0).getClass().getSimpleName().equals("Negate_opContext"))
			return GetNegate(t.getChild(i).getChild(0));
		else
			return (t.getChild(i).getText());
	}
	
	private String GetCompSymbol(ParseTree t) {
		switch(t.getChild(0).getText()) {
			case "less":
				return " < ";						
			case "less_equal":
				return " <= ";	
			case "greater_equal":
				return " >= ";
			case "greater":
				return " > ";
			case "equals":
				return " == ";
			case "and":
				return " && ";
			case "or":
				return " || ";
			default:
				return null;
		}
	}
	
	private String GetMathsSymbol(ParseTree t) {
		switch(t.getChild(0).getText()) {
			case "add":
				return " + ";
			case "subtract":
				return " - ";	
			case "multiply":
				return " * ";
			case "divide":
				return " / ";
			case "modulo":
				return " % ";
			case "inc":
				return "++";
			case "dec":
				return "--";
			default:
				return null;
		}
	}

	private String GetIndentation() {
		return String.join("", Collections.nCopies(indent_lv, indent));
	}
	
	private String GetTerminator() { return ";"; }
}
