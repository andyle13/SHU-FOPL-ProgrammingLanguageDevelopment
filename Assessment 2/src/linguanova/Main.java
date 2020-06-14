package linguanova;

import java.util.Scanner;

import linguanova.worker.*;

public class Main {
	private Scanner in;
	private IWorker worker;
	
	public static void main(String[] args) throws Exception {
		Main m = new Main();
	}
		
	Main() throws Exception {
		in = new Scanner(System.in);
		while(this.GetWorker()) {}
	}
			
	private boolean GetWorker() throws Exception {
		switch(GetChoice()) {
			case 1:
				worker = new ParseTreeWorker();
				return true;
			case 2:
				worker = new SearchTreeWorker();
				return true;
			case 3:
				worker = new SubtreesWorker();
				return true;
			case 4:
				worker = new JavaScriptWorker();
				return true;
			default:
				System.out.println("No valid option chosen. Program terminated.");
				return false;
		}
	}
	
	private int GetChoice() {
		System.out.println("Please select one of the following options:\n"
			+ "1. Display Parse Tree/JSON\n"
			+ "2. Search Parse Tree(s)\n"
			+ "3. Display Subtrees\n"
			+ "4. Execute Program in JavaScript\n"
			+ "Exit the program by entering a number other\n"
			+ "than those displayed above.\n"
			+ "Your input: ");
		return in.nextInt();
	}
}
