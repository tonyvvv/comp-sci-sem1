/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		System.out.print("A number between 0 - 9: ");
		int x = (int)(Math.random() * 9);
		System.out.println(x);
		System.out.print("A number between 0 - 10: ");
		int e = (int)(Math.random() * 10);
		System.out.println(e);
		
		System.out.print("A number between 2.5 and 3.5: ");
		System.out.println(Math.random() * (3.5 - 2.5) + 2.5);
		System.out.print("A number between 14 and 589: ");
		System.out.println(Math.random() * (589 - 14) + 14);
		
		
		
	}
}
