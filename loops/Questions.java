import java.io.Console;

public class Questions {
	public static void main(String args[]){
	
	Console console = System.console();
	String anyQuestions = console.readLine("Do you have any questions?");

		while(anyQuestions.equals("yes")){
			String question = console.readLine("What is your question?");
			console.printf("I do not understand your question.");
			anyQuestions = console.readLine("Do you have any questions?");
		}
	console.printf("Next slide");
	}
}