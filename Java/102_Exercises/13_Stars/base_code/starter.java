/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a integer: ");
		int a = sc.nextInt();
		int b = 0;
		int vi = 0;
		String star = new String("*");
		
		while(vi < a){
			while(b < vi+1){
				System.out.print("*");
				b = b + 1;
			} 
			System.out.print("");
			vi = 0;
			b = b + 1;
		}
		
	}
}
