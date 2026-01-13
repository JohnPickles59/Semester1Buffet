import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner num = new Scanner (System.in);
System.out.print("Enter 2 numbers to create a range for your random number");
System.out.print("Please enter an integer:");
int num1 = num.nextInt();
Scanner anothernum = new Scanner (System.in);
System.out.print("Please enter another integer (bigger than the first):");
int num2 = anothernum.nextInt();
System.out.println("Your range is " + num1 + " - " + num2 + ".");
System.out.println("Here are 5 numbers generated in that range.");
System.out.print((int)(Math.random() * (num1 - num2) + num2) + ", ");
System.out.print((int)(Math.random() * (num1 - num2) + num2) + ", ");
System.out.print((int)(Math.random() * (num1 - num2) + num2) + ", ");
System.out.print((int)(Math.random() * (num1 - num2) + num2) + ", ");
System.out.print((int)(Math.random() * (num1 - num2) + num2) + ".");
	}
}
