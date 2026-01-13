/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Pick a class.");
		System.out.println("Melee");
		System.out.println("Ranged");
		System.out.println("Mage");
		System.out.println("Summoner");
		Scanner Chooseclass = new Scanner (System.in);
		String role = Chooseclass.nextLine();
		if(role.equals("Melee")){
			System.out.print("You chose Melee. You're gonna tank all them hits for us other classes");
		}
		else if(role.equals("Ranged")){
			System.out.print("You chose Ranged. Yo! Thats my favorite!");
		}
		else if(role.equals("Mage")){
			System.out.print("In my opinion, this class is the worst besides Summoner...");
		}
		else if(role.equals("Summoner")){
			System.out.print("So you're a freeloader with the least amount of armor points who ALSO doesn't put in any work. Great...");
		}
		else{
			System.out.print("That isn't a class...");
		}
	}
}
