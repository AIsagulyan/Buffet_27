/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width: ");
		int w = sc.nextInt();
		System.out.print("Please enter a height: ");
		int h = sc.nextInt();
		int count2= 0;
		while(count2 < h){
			int count = 0;
			while(count < w){
				System.out.print("*");
				count++;
            }
			System.out.println();
            count2++;
		} 

	System.out.print("Please enter an integer: ");
	int n = sc.nextInt();
	int i = 1;
	while(i <= n){
		int j = 1;
		while (j <= i){
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
		}
	
	System.out.print("Reversed Star:Please enter an integer: ");
	int r = sc.nextInt();
	int s = 1;
	while (s <= r) {
		int j = 1;
		while (j <= (r-s)) {
			System.out.print(" ");
			j++;		
		}
		int k = 1;
		while(k<=s){
			System.out.print("*");
			k++;
		}
		
		System.out.println();
		s++;
		
		}	
	}
}
