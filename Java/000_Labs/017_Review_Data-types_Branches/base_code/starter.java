/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
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
								System.out.println("You've decided not to chose a role. Rerun program.");
								System.out.println();
							}
						}
					}
				}
			}
		}
		
		if (text.equals("wizard")) {
			System.out.println(wiz);
			System.out.println();
		}
		
		if (text.equals("Wizard")) {
			System.out.println(wiz);
			System.out.println();
		}
		
		if (text.equals("warrior")) {
			System.out.println(war);
			System.out.println();
		}
		
		if (text.equals("Warrior")) {
			System.out.println(war);
			System.out.println();
		}
		
		if (text.equals("rogue")) {
			System.out.println(rog);
			System.out.println();
		}
		
		if (text.equals("Rogue")) {
			System.out.println(rog);
			System.out.println();
		}
		
		int ptotal = 20;
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println();
		System.out.print("Strength (1-10): ");
		int st = sc.nextInt();
		if(st>10)
		{
			System.out.println("Please input a smaller value. Strength (1-10):");
			st = sc.nextInt();
		}
		
		ptotal = ptotal-st;
		System.out.println("You have "+ ptotal +" left to spend.");
		System.out.println();
			
		System.out.print("Dexterity (1-10): ");
		int dx = sc.nextInt();
		if(dx>10)
		{
			System.out.println("Please input a smaller value. Strength (1-10):");
			dx = sc.nextInt();
		}
		
		ptotal = ptotal-dx;
		System.out.println("You have "+ ptotal +" left to spend.");
		System.out.println();
		
		System.out.print("Intelligence (1-10): ");
		int ine = sc.nextInt();
		if(ine>10)
		{
			System.out.println("Please input a smaller value. Strength (1-10):");
			ine = sc.nextInt();
		}
		
		ptotal = ptotal-ine;
		System.out.println("You have "+ ptotal +" left to spend.");
		System.out.println();
		
		System.out.print("Charisma (1-10): ");
		int cha = sc.nextInt();
		if(cha>10)
		{
			System.out.println("Please input a smaller value. Strength (1-10):");
			cha = sc.nextInt();
		}
		
		ptotal = ptotal-cha;
		System.out.println("");
		System.out.println("");
		System.out.println("You have "+ptotal+" left to spend for next time.");
		System.out.println("--------------------------------------------------");
		
		
		
		System.out.println("you are "+name+", the "+title+" of CVHS.");
		System.out.println("you're a "+text+" with the following stats!");
		System.out.println("Strength - "+st);
		System.out.println("Dexterity - "+dx);
		System.out.println("Intelligence - "+ine);
		System.out.println("Charisma - "+cha);
		System.out.println("");
		System.out.println("Good luck on your quest "+name+"!");
	}
}
