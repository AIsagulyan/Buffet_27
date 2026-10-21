/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("Enter a number: ");
		int count = scanner.nextInt();


		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}

	
	}
}
