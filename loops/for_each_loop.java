
/**The syntax for the “for each” loop is as follows:
	for(declaration : expression)
	{
		//Statements
	}


	Now, if you have noticed all the above examples, they are generally used to manipulate integers. What does one do when they have to work with iteration over arrays? To answer this question, in Java 5 was introduced the “For-each” loop. This loop can be used very well with iteration over arrays and other such collections. Though you can use a “for” loop with the iteration operator, the code becomes much more readable with for-each loop when dealing with huge numbers. This loop is preferred to the “for” loop, not always, but when the following conditions are seen:

	Assigning elements: Avoid using for-each loop when you need to assign a value to an element. This loop can be used when only access is desired.
	Use with single structure: You cannot use the loop when you need to compare two arrays in a situation.
	Forward iterations only: Use the “for-each” loop only for forward looping and that too in single steps.
	Compatibility: If you need your code to be compatible with versions before Java 5, you might want to go for the regular for loop.
	 

	Let us take a look at the syntax for this loop:

	@author : Udemy
	date : 8th October 2015

**/

public class for_each_loop {
	public static void main(String[] args) {
		
		int [] numericals = {100,200,300,500,600,700,800};
		String [] names = {"Joe", "Beatrice","Mary","John"};

		for(int i : numericals){
			System.out.println("The value of the numericals are : "+i);
			System.out.print("\n");
		}	

		for(String i : names) {
			System.out.println("The value of the names are : "+i);
			System.out.print("\n");
		}


	}
}