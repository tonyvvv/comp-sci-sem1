/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input your first number:");
		int num1 = sc.nextInt();
		System.out.print("Please input your second number:");
		int num2 = sc.nextInt();
		
		boolean num;
		num = (num1!=num2);
		
		boolean num3;
		num3 = (num1==num2);
		
		
		if(num)
		{
		  System.out.println("Your numbers are different!");
		}
		
		if(num3)
		{
		  System.out.println("Your numbers are the same!");
		}
		
		
		
		
		
		 
	}
}
