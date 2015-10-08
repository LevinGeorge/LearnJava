
/**The syntax for the “do…while” loop is as follows:
	do
	{
		statements to be executed
	}
	while(Boolean_expression);


 	As you can see in the above code, the while statement that checks if the Boolean expression is true appears at the end of the “do” loop.
 	This means the statements inside the loop are executed once before the expression is checked.
 	If the statement is true, it will go back to the loop and execute the statements. 
 	But, if the statement if false, the loop ends and the flow continues with the next line of code after the While statement.


	
	Here is an example of the while loop:

	@author : Udemy
	date : 8th October 2015

**/

public class do_while_loop {
	public static void main(String args[]){

	int number = 10;

	do {
		System.out.println("The value of the number is : "+number);
		number++;
		System.out.print("\n");
	}
	while( number < 20);
	}
}


