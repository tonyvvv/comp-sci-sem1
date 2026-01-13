/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		String text1 = new String("Please enter a double: ");
		System.out.print(text1);
		double num1 = sc.nextInt();
		
		String text2 = new String("Please enter another double: ");
		System.out.print(text2);
		double num2 = sc.nextInt();
	
		System.out.println("Maximum number of x and y is: " + Math.max(num1,num2));
		System.out.println("Square root of y is: " + Math.sqrt(num2));
		System.out.println("Power of x and y is: " + Math.pow(num1,num2));
		
		
	}
}
