/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		int Cash = 100;
		int Num1 = 0;
		int Num2 = 0;
		int Num3 = 0;
		int Debt = 0;
		
		int TotalCash = 0;
		int CashWon = 0;
		int CashLost = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You have $100. Would you like to go to the casino?");
		String Casino = sc.nextLine();
		
		if(Casino.equals("yes") || Casino.equals("Yes") || Casino.equals("y") || Casino.equals("Y")){
			System.out.println("You can spend your money on the slot machine.");
			System.out.println("Two matching numbers will double your money.");
			System.out.println("Three matching numbers will triple your money");
			
			while(Cash > 0){
				System.out.println("You have $" + Cash);
				System.out.println("How much would you like to gamble?");
				int moneyinput = sc.nextInt();
				
				while(moneyinput <= Cash){
					if (moneyinput <= Cash){
					System.out.println("You input $" + moneyinput);
					
					Num1 = ((int)(Math.random() * 10));
					Num2 = ((int)(Math.random() * 10));
					Num3 = ((int)(Math.random() * 10));
					System.out.println(Num1 + " || " + Num2 + " || " + Num3);
					
					if(Num1 != Num2 && Num2 != Num3){
						System.out.println("You lost $" + moneyinput);
						Cash = Cash - moneyinput;
						CashLost = CashLost + moneyinput;
						
						if(Cash <= 25 && Cash > 1){
							System.out.println("You're looking short. Would you like to take a loan from the bank?");
							String loan = sc.nextLine();
							if(Casino.equals("yes") || Casino.equals("Yes") || Casino.equals("y") || Casino.equals("Y")){
								System.out.println("Good choice. Take $100!");
								Cash = Cash + 100;
								Debt = Debt + 100;
			}
			else{
				System.out.println("Bad choice. Goodbye");
			}
						}
					}
					if(moneyinput == Cash){
						System.out.println("Kind of stupid to put all of your money in.");
					}
					else if(Num1 == Num2 || Num1 == Num3 || Num2 == Num3){
						System.out.println("You doubled your input!");
						Cash = Cash + moneyinput * 2;
						CashWon = CashWon + moneyinput * 2;
					}
					else if(Num1 == Num2 && Num2 == Num3){
						System.out.println("You tripled your input!");
						Cash = Cash + moneyinput * 3;
						CashWon = CashWon + moneyinput * 3;
						
					}
					break;
					
					}
					else{
						System.out.println("You don't have that amount of money. Try again.");
					}
				}
				
			}
			TotalCash = Cash - Debt;
			System.out.println("___________________________");
			System.out.println("Final Score:");
			System.out.println("Cash: " + Cash);
			System.out.println("Cash Won: "+ CashWon);
			System.out.println("Cash Lost: " + CashLost);
			System.out.println("Debt: " + Debt);
			System.out.println("Total Cash:" + TotalCash);
		}
		else{
			System.out.println("Bad choice. Goodbye.");
		}
		
	}
}