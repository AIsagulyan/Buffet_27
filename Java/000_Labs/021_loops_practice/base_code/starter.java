/*
 *	Author:  
 *  Date: 
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Random random = new Random();
		int targetNumber = random.nextInt(1000) + 1;
		int userGuess = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("I have picked a number between 1 and 1000. Can you guess it?");

		while (userGuess != targetNumber) {
			System.out.print("Enter your guess: ");
			userGuess = scanner.nextInt();

			if (userGuess < targetNumber) {
				System.out.println("Your guess is lower than the target number. Try again!");
			} else if (userGuess > targetNumber) {
				System.out.println("Your guess is higher than the target number. Try again!");
			} else {
				System.out.println("you got it");
		}
	
	}
}
}
