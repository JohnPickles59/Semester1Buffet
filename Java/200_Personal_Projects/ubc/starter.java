/*
 *	Author:  ME GRAYSEN
 *  Date: Nov 21 2025
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int playerhp = 100;
		int CPUhp = 100;
		int playerattackland = 0;
		int CPUattackland = 0;
		int playerdamage = 0;
		int CPUdamage = 0;
		Scanner sc = new Scanner(System.in);
		
		while(playerhp > 0 || CPUhp > 0){
			//LIST
			System.out.println("");
			System.out.println("Your Health: " + playerhp);
			System.out.println("Opponent's Health: " + CPUhp);
			System.out.println("Your list of attacks are:");
			System.out.println("1. Punch (Damage: 5-10)");
			System.out.println("Enter a number on the list to use an attack.");
			int attacknum = sc.nextInt();
			
			//ATTACKS
			if(attacknum == 1){
				System.out.println("You used punch!");
				
				System.out.println("Did it land? You rolled a:");
				playerattackland = (int)(Math.random() * 2) + 1;
				
				if(playerattackland == 1){
					System.out.println("Your attack didn't land");
				}
				else{
					System.out.println("Your attack landed!");
					System.out.println("How much damage did it do?");
					playerdamage = (int)(Math.random() * (5 - 10) + 10);
					System.out.println(playerdamage);
					
					CPUhp = CPUhp - playerdamage;
					
				}
			}
		}
	}

}
