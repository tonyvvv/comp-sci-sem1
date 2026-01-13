/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		String one = new String("The Celsius value for ");
		String two = new String("Fahrenheit is ");
		String de = new String(" degrees ");
		double a;
		double b, c;
		double d;
		double e;
		a = 1.0;
		b = 6.0;
		c = 25.0;
		d = a + b + c;
		e = a - b + c/5;
		System.out.print(one+d+de+two+e+de);
	}
}
