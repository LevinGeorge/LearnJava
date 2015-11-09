public class number_ladder{
	public static void main(String argsp[]){

	int start = 1;		//Starting integer.

	while(start < 10){		//Beginning the outer loop
		System.out.println();	
		for(int i = 1;i<=start;i++){	//Inner loops which loops through each numbers.
			System.out.print(i);		//Printing out the numbers.
		}
		start++;	//Incrementing the outer loop		
	}
	}
}
