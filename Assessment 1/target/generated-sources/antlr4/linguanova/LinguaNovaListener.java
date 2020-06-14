// Generated from LinguaNova.g4 by ANTLR 4.7.1

	package linguanova;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguaNovaParser}.
 */
public interface LinguaNovaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LinguaNovaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LinguaNovaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LinguaNovaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LinguaNovaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(LinguaNovaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(LinguaNovaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#array_length}.
	 * @param ctx the parse tree
	 */
	void enterArray_length(LinguaNovaParser.Array_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#array_length}.
	 * @param ctx the parse tree
	 */
	void exitArray_length(LinguaNovaParser.Array_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(LinguaNovaParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(LinguaNovaParser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#math_op}.
	 * @param ctx the parse tree
	 */
	void enterMath_op(LinguaNovaParser.Math_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#math_op}.
	 * @param ctx the parse tree
	 */
	void exitMath_op(LinguaNovaParser.Math_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#incdec_op}.
	 * @param ctx the parse tree
	 */
	void enterIncdec_op(LinguaNovaParser.Incdec_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#incdec_op}.
	 * @param ctx the parse tree
	 */
	void exitIncdec_op(LinguaNovaParser.Incdec_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#rtn}.
	 * @param ctx the parse tree
	 */
	void enterRtn(LinguaNovaParser.RtnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#rtn}.
	 * @param ctx the parse tree
	 */
	void exitRtn(LinguaNovaParser.RtnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#static_assignments}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assignments(LinguaNovaParser.Static_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#static_assignments}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assignments(LinguaNovaParser.Static_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#main_body}.
	 * @param ctx the parse tree
	 */
	void enterMain_body(LinguaNovaParser.Main_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#main_body}.
	 * @param ctx the parse tree
	 */
	void exitMain_body(LinguaNovaParser.Main_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(LinguaNovaParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(LinguaNovaParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(LinguaNovaParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(LinguaNovaParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(LinguaNovaParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(LinguaNovaParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(LinguaNovaParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(LinguaNovaParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LinguaNovaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LinguaNovaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#negate_op}.
	 * @param ctx the parse tree
	 */
	void enterNegate_op(LinguaNovaParser.Negate_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#negate_op}.
	 * @param ctx the parse tree
	 */
	void exitNegate_op(LinguaNovaParser.Negate_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#equals_op}.
	 * @param ctx the parse tree
	 */
	void enterEquals_op(LinguaNovaParser.Equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#equals_op}.
	 * @param ctx the parse tree
	 */
	void exitEquals_op(LinguaNovaParser.Equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void enterComparison_op(LinguaNovaParser.Comparison_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#comparison_op}.
	 * @param ctx the parse tree
	 */
	void exitComparison_op(LinguaNovaParser.Comparison_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void enterLogic_op(LinguaNovaParser.Logic_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#logic_op}.
	 * @param ctx the parse tree
	 */
	void exitLogic_op(LinguaNovaParser.Logic_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LinguaNovaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LinguaNovaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(LinguaNovaParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(LinguaNovaParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(LinguaNovaParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(LinguaNovaParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(LinguaNovaParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(LinguaNovaParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(LinguaNovaParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(LinguaNovaParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#sCase}.
	 * @param ctx the parse tree
	 */
	void enterSCase(LinguaNovaParser.SCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#sCase}.
	 * @param ctx the parse tree
	 */
	void exitSCase(LinguaNovaParser.SCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#sDefault}.
	 * @param ctx the parse tree
	 */
	void enterSDefault(LinguaNovaParser.SDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#sDefault}.
	 * @param ctx the parse tree
	 */
	void exitSDefault(LinguaNovaParser.SDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(LinguaNovaParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(LinguaNovaParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(LinguaNovaParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(LinguaNovaParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void enterForeach_loop(LinguaNovaParser.Foreach_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#foreach_loop}.
	 * @param ctx the parse tree
	 */
	void exitForeach_loop(LinguaNovaParser.Foreach_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(LinguaNovaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(LinguaNovaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(LinguaNovaParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(LinguaNovaParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#array_container}.
	 * @param ctx the parse tree
	 */
	void enterArray_container(LinguaNovaParser.Array_containerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#array_container}.
	 * @param ctx the parse tree
	 */
	void exitArray_container(LinguaNovaParser.Array_containerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#array_items}.
	 * @param ctx the parse tree
	 */
	void enterArray_items(LinguaNovaParser.Array_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#array_items}.
	 * @param ctx the parse tree
	 */
	void exitArray_items(LinguaNovaParser.Array_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#single_cmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_cmt(LinguaNovaParser.Single_cmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#single_cmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_cmt(LinguaNovaParser.Single_cmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#multi_cmt}.
	 * @param ctx the parse tree
	 */
	void enterMulti_cmt(LinguaNovaParser.Multi_cmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#multi_cmt}.
	 * @param ctx the parse tree
	 */
	void exitMulti_cmt(LinguaNovaParser.Multi_cmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaNovaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LinguaNovaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaNovaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LinguaNovaParser.StatementContext ctx);
}