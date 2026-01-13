import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner num = new Scanner (System.in);
		System.out.print("Please enter your first number:");
		int num1 = num.nextInt();
		Scanner anothernum = new Scanner (System.in);
		System.out.print("Please enter your second number:");
		int num2 = anothernum.nextInt();
		Scanner anotherothernum = new Scanner (System.in);
		System.out.print("Please enter your third number:");
		int num3 = anotherothernum.nextInt();
		
		//Biggest Number:
		if ((num1 > num2) && (num1 > num3)) {
			System.out.print(num1 + " is the largest number and ");
		}
			else if ((num2 > num1) && (num2 > num3)) {
				System.out.print(num2 + " is the largest number and ");
		}
			else if ((num3 > num2) && (num3 > num1)) {
				System.out.print(num3 + " is the largest number and ");
		}
		//Smallest Number:
		if ((num1 < num2) && (num1 < num3)) {
			System.out.print(num1 + " is the smallest number.");
		}
			else if ((num2 < num1) && (num2 < num3)) {
				System.out.print(num2 + " is the smallest number.");
		}
			else if ((num3 < num1) && (num3 < num2)) {
				System.out.print(num3 + " is the smallest number.");	
		}

	}
}