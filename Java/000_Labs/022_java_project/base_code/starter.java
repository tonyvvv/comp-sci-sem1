/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
		String ans = sc.nextLine();
		int total = 100;
		if(ans.equals("Yes")){
			System.out.print("You have $100. How much would you like to wager? ");
			int wage = sc.nextInt();
		}
		if(ans.equals("yes")){
			System.out.print("You have $100. How much would you like to wager? ");
			int wage = sc.nextInt();
		}
		if(ans.equals("Y")){
			System.out.print("You have $100. How much would you like to wager? ");
			int wage = sc.nextInt();
		}
		if(ans.equals("y")){
			System.out.print("You have $100. How much would you like to wager? ");
			int wage = sc.nextInt();
		}
		int x = (int)(Math.random() * 10);
		int g = (int)(Math.random() * 10);
		int h = (int)(Math.random() * 10);
		int c = 0;
		
		if(x == g){
			c = c + 1;
		}
		if(x == h){
			c = c + 1;
		}
		if(g == h){
			c = c + 1;
		}
		
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are:");
		System.out.println("_______________________");
		System.out.println(" | "+x+" | "+g+" | "+h+" | ");
		System.out.println("_______________________");
		System.out.println("");
		
		if(c == 0){
			System.out.println("Didn't win this time, better luck next time!");
			System.out.println("You now have "+total+".");
		}
		if(c == 1){
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have "+total+".");
		}
		if(c == 2){
			System.out.println("You won! You're wager has now been tripled!");
			System.out.println("You now have "+total+".");
		}
		if(c == 3){
			System.out.println("");
			
		}
		
		
	}
}
