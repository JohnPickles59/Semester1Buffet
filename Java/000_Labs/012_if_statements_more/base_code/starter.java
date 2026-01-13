import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter one number:");
		Scanner Choosenum1 = new Scanner (System.in);
		int num1 = Choosenum1.nextInt();
		System.out.println("Enter another number:");
		Scanner Choosenum2 = new Scanner (System.in);
		int num2 = Choosenum2.nextInt();
	
		if (num1 != num2){
			System.out.println("Both numbers are different from eachother");
			if (num1 < num2){
				System.out.print("The second number is greater than the first number");
			}
			else if (num1 > num2){
				System.out.print("The first number is greater than the second number");
			}
		}
		
		else if (num1 == num2){
			System.out.print("Both numbers are the same value");
		}
	}
}
