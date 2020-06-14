package linguanova.worker;

import java.util.LinkedList;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import linguanova.LinguaNovaBaseListener;
import linguanova.LinguaNovaParser;

public class SubtreesWorker extends LinguaNovaBaseListener implements IWorker {
	private Queue<ParserRuleContext> subtrees;
	private String search = null;
	
	public SubtreesWorker() throws Exception {
		subtrees = new LinkedList<ParserRuleContext>();
		LinguaNovaParser parser = GetParser();
	    search = GetRule();
		WalkTree(this, parser.prog());
		    
		if(subtrees.size() != 0)
			for(ParseTree t : subtrees)
				DisplayTree(parser, t);
		else
			System.out.println(search + " is not a valid rule.");
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		try {
			Class<?> cls = Class.forName(search);
			if(ctx.getClass().isAssignableFrom(cls)) {
				subtrees.add(ctx);
			}
		} catch (ClassNotFoundException e) {}
	}
}
