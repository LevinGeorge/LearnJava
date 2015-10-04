/**
 * @author : Levin George
 * A for-each loop.
 * 1. Useful when you want tp process everyhting in the list.
 * 2. More legible and should be favoured when processing an array. 
 **/


public class JacksonsOldSchool{
	public static void main(String argsp[]){

		String[] names = {"Michelle","Jackie","Daniel","Tito"};

		System.out.println("The Jackson 4 are: ");

		for(int i =0;i<names.length;i++)
		{
			System.out.println("The names of the Jackson family are : "+names[i]);
		}
	}
}