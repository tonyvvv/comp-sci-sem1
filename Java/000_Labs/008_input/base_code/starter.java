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
		
		System.out.println("What is your name?");
		String text = sc.nextLine();
		
		System.out.println("What is your age?");
		int number = sc.nextInt();
		
		System.out.println("What month were you born? (1-12)");
		int number1 = sc.nextInt();
		
		System.out.println("What day were you born? (1-31)");
		int number2 = sc.nextInt();
		
		System.out.println("What year were you born?");
		int number3 = sc.nextInt();
		
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double number4 = sc.nextDouble();
		
		String slash = new String("/");
		String text1 = new String("Your name is ");
		String text2 = new String(" and you were born on ");
		String text3 = new String("You are ");
		String text4 = new String(" years old!!!");
		String text5 = new String("You have ");
		String text6 = new String(" in your wallet.");
		System.out.println(text1 + text + text2 + number1 + slash + number2 + slash + number3);
		System.out.println(text3 + number + text4);
		System.out.println(text5 + number4 + text6);
	}
}
