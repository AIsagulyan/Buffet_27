/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter 2 number to create range");
		System.out.print(" enter an integer: ");
		int num1 = sc. nextInt();
		System.out.println(" enter another integer(bigger than first one): ");
		int num2 = sc. nextInt();
		System.out.println("your range is " + num1 + " to " + num2);
        System.out.println("5 number  generate range");
		for (int i = 0; i < 5; i++) {

        	int random_num = random.nextInt((num2 - num1) + 1) + num1;
			System.out.print(random_num + ", ");
			
		}
		System.out.println();
		




	}

}
