/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many stars?");
		int numStars = sc.nextInt();
		int count = 0;
		int rows = 0;
		
		while(rows < numStars){
			while(count < rows + 1){
			System.out.print("* ");
			count = count + 1;
			}
			System.out.println();
			
			count = 0;
			rows = rows + 1;
		}
	}
}
