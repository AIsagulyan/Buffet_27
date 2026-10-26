/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Random random = new Random();
		int secretNumber = random.nextInt(1000) + 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Guess a number between 1 and 100: ");
		int userGuess = scanner.nextInt();
		if (userGuess == secretNumber) {
			System.out.println("Correct! You guessed the number.");
		}
		else if (userGuess > secretNumber) {
			System.out.println("Too high! The secret number is lower than your guess.");
		}	
		else{
			System.out.println("Too high! The secret number is lower than your guess.");
		}	
	
	}
}
