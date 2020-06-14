package linguanova.worker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

import linguanova.LinguaNovaLexer;
import linguanova.LinguaNovaParser;

@SuppressWarnings("deprecation")
public interface IWorker {
	
	default void WalkTree(ParseTreeListener worker, ParseTree root) {
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(worker, root);
	}
	
	@SuppressWarnings("resource")
	default String GetInput() {
		return new Scanner(System.in).nextLine();
	}
	
	default String GetRule() {
		System.out.println("Enter a rule by context:");	
		return "linguanova.LinguaNovaParser$" + GetInput() + "Context";
	}
	
	default LinguaNovaParser GetParser( ) throws Exception {
		File f = GetFile();
		FileInputStream fis = new FileInputStream(f);
		ANTLRInputStream input = new ANTLRInputStream(fis);
	    LinguaNovaLexer lexer = new LinguaNovaLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    return new LinguaNovaParser(tokens);
	}
	
	default void DisplayTree(LinguaNovaParser p, ParseTree t) {
	    // source: https://stackoverflow.com/questions/23809005/how-to-display-antlr-tree-gui
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
	                p.getRuleNames()),t);
	    viewr.setScale(1.5);//scale a little
	    panel.add(viewr);
	    frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,300);
        frame.setVisible(true);
        
        JScrollPane scrPane = new JScrollPane(panel,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	    frame.getContentPane().add(scrPane);   
   	}
	
	default File GetFile() throws Exception {
		File f = new File("sampleprograms");
		FilenameFilter txtFinder = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".txt");
			}
		};
		
		File[] files = (f.listFiles(txtFinder));
		
	    for (int i = 0; i < files.length; i++) {
	        System.out.println(i + " - " + files[i].getName());
	    }
	    System.out.println("Please choose a file.");
	    
	    return files[new Scanner(System.in).nextInt()];
	}
}
