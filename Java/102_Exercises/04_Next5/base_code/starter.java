/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String text1 = new String("Please enter a number: ");
		System.out.print(text1);
		double num1 = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		
		System.out.print(num1 + ", ");
		System.out.print(num1 + 1 + ", ");
		System.out.print(num1 + 2 + ", ");
		System.out.print(num1 + 3 + ", ");
		System.out.print(num1 + 4 + ", ");
		System.out.println(num1 + 5);
		
		System.out.println("Here are the next 5 multiples of " + num1 + "!");
		System.out.print(num1 + ", ");
		System.out.print(num1 * 2 + ", ");
		System.out.print(num1 * 3 + ", ");
		System.out.print(num1 * 4 + ", ");
		System.out.print(num1 * 5 + ", ");
		System.out.println(num1 * 6 + ", ");
		
		System.out.println("here is " + num1 + " divided by 100!");
		System.out.println(num1/100);
		
		System.out.println("here is " + num1 + " divided by 10!");
		System.out.print(num1/10);
		
		
		
		
	}
}
