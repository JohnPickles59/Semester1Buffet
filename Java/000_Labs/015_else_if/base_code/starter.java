/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter one number:");
		Scanner Choosenum1 = new Scanner (System.in);
		int num1 = Choosenum1.nextInt();
		int numrandom = (int)(Math.random()*(1000-1)+1);
		if (num1 < numrandom){
			System.out.print("Your number: " + num1 + " is less than the computer's number:" + numrandom);
		}
		else{
			System.out.print("Your number: " + num1 + " is greater than the computer's number:" + numrandom);
		}
	}
}
