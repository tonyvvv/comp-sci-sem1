/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random() * 1000);
		System.out.println("Please enter a number between 1 and 1000:");
		int num = sc.nextInt();
		
		if(num>x) {
			System.out.println("Your number was too high, guess again.");
		}
		
		if(num<x) {
			System.out.println("Your number was too low, guess again.");
		}
			
		
	}
}
