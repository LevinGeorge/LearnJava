
/**The Syntax for While loop is as follows –
	while(Boolean_expression)
	{
 		//Statements
 	}

 	This loop will execute when the Boolean expression is true. 
 	If the statement is false, the code will not enter the loop. 
 	The code will then go ahead with the statements that follow the while loop.
	
	Here is an example of the while loop:

	@author : Udemy
	date : 8th October 2015

**/


public class while_loop {
	public static void main(String[] args) {
	
		int number = 10;

		while(number < 20){
			System.out.println("The value of the number is : "+number);
			number++;
			System.out.println("\n");
		}

	}
}