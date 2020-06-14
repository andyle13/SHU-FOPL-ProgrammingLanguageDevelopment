package linguanova.worker;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import linguanova.LinguaNovaParser;

public class ParseTreeWorker implements IWorker {
	
	private static final Gson GSON_BUILDER = new GsonBuilder().setPrettyPrinting().create();
	private Map<String, Object> map = null;
	
	public ParseTreeWorker() throws Exception {
		LinguaNovaParser parser = GetParser();
		ParseTree tree = parser.prog();
		map = new LinkedHashMap<>();
	    System.out.println(GSON_BUILDER.toJson(
	    		ToMap(tree)
	    		));
	    
	    DisplayTree(parser, tree);
	}
	
	public Map<String, Object> ToMap(ParseTree tree) {
	    Map<String, Object> map = new LinkedHashMap<>();
	    BuildJSON(tree, map);
	    return map;
	}

	public void BuildJSON(ParseTree tree, Map<String, Object> map) {
		//source: https://stackoverflow.com/questions/49116223/convert-antlr-parse-tree-to-json
		if (tree instanceof TerminalNodeImpl) {
			Token token = ((TerminalNodeImpl) tree).getSymbol();
			map.put("type", token.getType());
		    map.put("text", token.getText());
		}
	    else {
	    	List<Map<String, Object>> children = new ArrayList<>();
	    	String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
	    	map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

	    	for (int i = 0; i < tree.getChildCount(); i++) {
	    		Map<String, Object> nested = new LinkedHashMap<>();
		        children.add(nested);
		        BuildJSON(tree.getChild(i), nested);
		    }
	    }
	}
}
