/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int money = 100;
		System.out.println("=== Welcome to the Digital Slot Machine! ===");
		System.out.println("You start with $" + money);
		while (money > 0){
			System.out.print("Enter your wager(Current balance: $" + money + "):");
			if (!scanner.hasNextInt()) {
				System.out.println("Please enter a valid number.");
				scanner.next();
				continue;
			}	
			int wager = scanner.nextInt();
			if (wager <= 0) {
				System.out.println("Wager must be greater than $0.");
				continue;
			}
			if (wager > money) {
				System.out.println("You don't have enough money for that wager! Try again.");
				continue;
			}
			int num1 = random.nextInt(9)+1;
			int num2 = random.nextInt(9)+1;
			int num3 = random.nextInt(9)+1;
			System.out.println("Rolling... ???");
			System.out.println("Result:" + num1 + "|" + num2 + "|" + num3);
			if (num1 == num2 && num2 == num3) {
				int winnings = wager * 3;
				money += winnings;
				System.out.println("JACKPOT! Three numbers match! You won $" + "!");
			} else if (num1 == num2 || num1 == num3 || num2 == num3) {
				int winnings = wager * 2;
				money += winnings;
				System.out.println("Two numbers match! You won $" + winnings + "!");
			} else {
				money -= wager;
				System.out.println("No match. You lost $" + wager+ ".");
			}
			if (money <= 0)	{
				System.out.println("YOu have run out of money! Game over.");
				break;
			}
			boolean validResponse = false;
			while (!validResponse) {
				System.out.print("Do you want to play again? (Yes/No): ");
				String playAgain = scanner.next();
				if (playAgain.equalsIgnoreCase("No") || playAgain.equalsIgnoreCase("N")){
					validResponse = true;
					money = 0;
					System.out.println("Thanks for playing!");
				} else if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("Y")){
					validResponse = true;
				} else {
					System.out.println("Invalid input. Please enter'Yes', 'yes','Y', 'y', 'No', 'no', 'N', or 'n'.");
				}
			}
		}
		System.out.println(" === Game Over == ");
		System.out.println("You ended with $" + money + " virtual dollars.");
		scanner.close();		

	}
}
