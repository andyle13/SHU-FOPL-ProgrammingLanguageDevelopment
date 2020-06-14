package linguanova.worker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import linguanova.LinguaNovaBaseListener;

public class SearchTreeWorker extends LinguaNovaBaseListener implements IWorker {
	
	private Queue<ParserRuleContext> result;
	private ArrayList<String> chainSearch = null;
	
	public SearchTreeWorker() throws Exception {
		result = new LinkedList<ParserRuleContext>();
		chainSearch = new ArrayList<String>();
		ParseTree tree = GetParser().prog();
			
		do chainSearch.add(GetRule());
		while(IsChained());
		    
		WalkTree(this, tree);
		GetRulesFound();
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		//System.out.println(ctx.getClass().getName());
		for(String s : chainSearch) {
			try {
				Class<?> cls = Class.forName(s);
				if(ctx.getClass().isAssignableFrom(cls)) {
					result.add(ctx);
				}
			} catch (ClassNotFoundException e) {}
		}
	}

	private boolean IsChained() {
		System.out.println("Do you want to chain our search? (y/n)");
		return GetInput().equals("y");
	}
	
	private void GetRulesFound() {
		for(String s : chainSearch) {
			int found = 0;
			for(ParserRuleContext p : result) {
				if(s.equals(p.getClass().getName()))
					found++;
			}
			if(found != 0)
				System.out.println(s + " found: " + found + ".");
			else
				System.out.println(s + " does not exist.");
		}
		
		System.out.println("Total rule(s) found: " + result.size());
	}
}
