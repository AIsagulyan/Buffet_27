/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(num +", "+ (num+1)+", "+ (num+2) +", "+ (num+3) +", "+ (num+5));
		System.out.println(num +", "+ (num*2)+", "+ (num*3) +", "+ (num*4) +", "+ (num*5));
		System.out.println((num+0.0)/100.0);
		System.out.println((num+0.0)/10.0);
	}
}
