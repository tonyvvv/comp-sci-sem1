/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Tony's Steakhouse");
        System.out.println("Here's our menu:");
        System.out.println("1. 🥩 Ribeye steak - $25.50");
        System.out.println("2. 🥔 Mash potatos - $3.99");
        System.out.println("3. 🧀 Mac and Cheese - $4.99");
        System.out.println("");
        
        System.out.println("what is the name for your order?");
		String name = sc.nextLine();
		System.out.println("How many orders of Ribeye Steak would you like?");
		int item = sc.nextInt();
	    System.out.println("How many orders of Mash Potatos would you like?");
		int item1 = sc.nextInt();
		System.out.println("How many orders of Mac and Cheese would you like?");
		int item2 = sc.nextInt();
		System.out.println("how much would you like to tip?");
		double tip = sc.nextDouble();
		System.out.println(name + "s Receipt");
		System.out.println("--------------------------------");
		double price1 = item * 25.50;
		double price2 = item1 * 3.99;
		double price3 = item2 * 4.99;
		System.out.println(item + " x Ribeye Steak = $"+ price1);
		System.out.println(item1 + " x Mash Potatos = $"+ price2);
		System.out.println(item2 + " x Mac and Cheese = $"+ price3);
		
		double total = price1 + price2 + price3 + tip;
		System.out.println("--------------------------------");
		System.out.println("The Grant Total is - " + total);
		
		
		
		
		
        
        
	}
}
