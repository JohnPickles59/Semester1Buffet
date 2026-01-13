/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("What's your name?");
		Scanner Choosename = new Scanner (System.in);
		String name = Choosename.nextLine();
		System.out.println("That sounds stupid.");
		
		System.out.println("Pick a weapon.");
		System.out.println("Sword");
		System.out.println("Battle Axe");
		System.out.println("Stiletto");
		String role = Choosename.nextLine();
		if(role.equals("Sword")){
			System.out.println("You chose Sword. A medium weapon. Decent.");
		}
		else if(role.equals("Battle Axe")){
			System.out.println("You chose Heavy. Yo! Thats my favorite!");
		}
		else if(role.equals("Stiletto")){
			System.out.println("Light Weapon. This is the worst...");
		}
		else{
		
		System.out.println("Ok... You're whatever that is.");
		}
		
		System.out.println("So, what title do you want?");
		String title = Choosename.nextLine();
		System.out.println("That sounds stupid.");
		System.out.println("Seriously, what are these cringey titles and names?");
		System.out.println("Ok, you are " + name + ", the " + title + " " + role + " of... hm... Where do you live?");
		String area = Choosename.nextLine();
		System.out.println("Ok, you are " + name + ", the " + title + " " + role + " of " + area + ".");
		System.out.println("Seriously? You could live anywhere and you chose there?");
		System.out.println("Dissapointing");
		System.out.println("Let's upgrade your attributes.");
		System.out.println("You have 20 skill points.");
		
		int points = 20;
		
		System.out.println("How much would you like to put in strength?");
		int strength = Choosename.nextInt();
		if (strength > 10 || strength > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - strength;
			System.out.print("You have " + points + " points left.");
		}
		System.out.println("How much would you like to put in fortitude?");
		int fortitude = Choosename.nextInt();
		if (fortitude > 10 || fortitude > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - fortitude;
			System.out.print("You have " + points + " points left.");
		}
		System.out.println("How much would you like to put in agility?");
		int agility = Choosename.nextInt();
		if (agility > 10 || agility > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - agility;
			System.out.print("You have " + points + " points left.");
		}
		System.out.println("How much would you like to put in willpower?");
		int willpower = Choosename.nextInt();
		if (willpower > 10 || willpower > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - willpower;
			System.out.print("You have " + points + " points left.");
		}
		System.out.println("How much would you like to put in intelligence?");
		int intelligence = Choosename.nextInt();
		if (intelligence > 10 || intelligence > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - intelligence;
			System.out.print("You have " + points + " points left.");
		}
		System.out.println("How much would you like to put in charisma?");
		int charisma = Choosename.nextInt();
		if (charisma > 10 || charisma > points){
			System.out.println("Pick another number less than that. Max input is 10.");
		}
		else{
			points = points - charisma;
		}
		
		System.out.println("Ok, you are " + name + ", the " + title + " " + role + " of " + area + ".");
		System.out.println("Your stats are:");
		System.out.println("Strength: " + strength);
		System.out.println("Fortitude: " + fortitude);
		System.out.println("Agility: " + agility);
		System.out.println("Willpower: " + willpower);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println("What a buns build.");
		
	}
}
