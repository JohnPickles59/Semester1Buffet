import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num1 = 15;
		int num2 = 30;
		System.out.println("The first number is: " + num1);
		System.out.println("The second number is: " + num2);
	
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
