/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in a word");
		String word = sc.nextLine();
		
		if(word.equals("frog")){
			System.out.println("         _____    _____        ");
			System.out.println("        /     \\ /      \\     ");
			System.out.println("       /   O        O   \\     ");
			System.out.println("      [        -         ]     ");
			System.out.println("      [     ________     ]     ");
			System.out.println("     /                    \\   ");
			System.out.println("    /                      \\  ");
			System.out.println("      ");
		}
		else if(word.equals("tree")){
			System.out.println("        oooooo        ");
			System.out.println("     oooooooooooo     ");
			System.out.println("   oooooooooooooooo   ");
			System.out.println("");
			System.out.println("  oooooooooooooooooo  ");
			System.out.println("  oooooooooooooooooo  ");
			System.out.println("   oooooooooooooooo   ");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
		else if(word.equals("face")){
			System.out.print("");
		}
		else{
			System.out.print("Invalid input! Enter another word!");
		}
	}
}
