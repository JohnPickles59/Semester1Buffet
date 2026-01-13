/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner Goon = new Scanner (System.in);
System.out.print("Please enter a number:");
int MegaGoon = Goon.nextInt();
System.out.println("Here are the next 5 numbers of " + MegaGoon + "!");
System.out.print((MegaGoon + 0.0) + ", ");
System.out.print((MegaGoon + 1.0) + ", ");
System.out.print((MegaGoon + 2.0) + ", ");
System.out.print((MegaGoon + 3.0) + ", ");
System.out.println((MegaGoon + 4.0) + ", ");
System.out.println("Here are the next 5 multiples of " + MegaGoon +"!");
System.out.print((MegaGoon * 1.0 ) + ", ");
System.out.print((MegaGoon * 2.0 ) + ", ");
System.out.print((MegaGoon * 3.0 ) + ", ");
System.out.print((MegaGoon * 4.0 ) + ", ");
System.out.println((MegaGoon * 5.0 ) + ", ");
System.out.println("Here is " + MegaGoon + " divided by 100!");
System.out.println(MegaGoon / 100.0);
System.out.println("Here is " + MegaGoon + " divided by 10!");
System.out.println(MegaGoon / 10.0);
	}
}
