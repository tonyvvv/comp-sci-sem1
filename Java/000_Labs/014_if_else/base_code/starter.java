/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Pick a number between 1 - 1000: ");
		double num = sc.nextInt();
		
		int a = (int)(Math.random() * (1000 - 1) + 1);
		
		boolean num1;
		num1 = (num==a);
		
		if(num1)
		{
			System.out.print("");
		}
		else
		{
			System.out.print("Your number wasn't the random number. The number was "+a+".");
		}
		
		
		
		
	}
}
