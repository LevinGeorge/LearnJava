/**
 * @author : Levin George
 * Here, we learn about for-loops.
 * for(initialisation, termination,increment) {}
 **/

import java.util.Scanner;

 public class MilkBottles {
 	public static void main(String[] args) {
 		
 		Scanner scan = new Scanner(System.in);
 		System.out.println("How many bottles do you have?");
 		int bottles = scan.nextInt();

 		for(int i =bottles;i>0;i--)
 		{
 			System.out.println(i+" bottles of milk on the wall...");  
 		}
 	}
	
}