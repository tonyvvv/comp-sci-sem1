/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String text = sc.nextLine();
		
		String wiz = new String("You've chosen the Wizard! Excelsior!");
		String war = new String("You've chosen the Warrior! For honor!");
		String rog = new String("You've chosen the Rogue! How cunning!");
		
		if (!text.equals("wizard")) {
			if (!text.equals("Wizard")) {
				if (!text.equals("warrior")) {
					if (!text.equals("Warrior")) {
						if (!text.equals("rogue")) {
							if (!text.equals("Rogue")) {
								System.out.print("You've decided not to chose a role. Rerun program.");
							}
						}
					}
				}
			}
		}
		
		if (text.equals("wizard")) {
			System.out.print(wiz);
		}
		
		if (text.equals("Wizard")) {
			System.out.print(wiz);
		}
		
		if (text.equals("warrior")) {
			System.out.print(war);
		}
		
		if (text.equals("Warrior")) {
			System.out.print(war);
		}
		
		if (text.equals("rogue")) {
			System.out.print(rog);
		}
		
		if (text.equals("Rogue")) {
			System.out.print(rog);
		}
	}
}
