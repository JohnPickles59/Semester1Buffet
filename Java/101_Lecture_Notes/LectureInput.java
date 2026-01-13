/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner Chum = new Scanner(System.in);
        System.out.println("Tuff Timmothy's Tuff Stuff");
        System.out.println("~~Menu~~");
        System.out.println("1.🥭 TUFF MANGOES(Optional with a side of phonk)  - $2.50 per lb");
        System.out.println("2.6️⃣7️⃣ 67 (Extra Tuff) - $5.00 per lb");
        System.out.println("3.🥪 Mustard (Did somebody say MUSTARD?) - $10.00 per lb");
        System.out.println("");
        
        System.out.println("Who's order is this?");
        String name = Chum.nextLine();
        System.out.println("How many pounds of TUFF MANGOES do you want");
        int item1 = Chum.nextInt();
        System.out.println("How many pounds of 67 do you want");
        int item2 = Chum.nextInt();
        System.out.println("How many pounds of MUSTARD do you want");
        int item3 = Chum.nextInt();
        
        double price1 = item1 * 2.50;
        double price2 = item2 * 5.00;
        double price3 = item3 * 10.00;
        
        System.out.println("How much would you like to invest int TUFF COIN?");
        double tip = Chum.nextDouble();
        
        double total = price1 + price2 + price3 + tip;
        System.out.println(name + "'s Receipt");
        System.out.println("TUFF MANGOES Mogged: " + price1);
        System.out.println("67s obtained: " + price2);
        System.out.println("Mustards Kendricked: " + price3);
        System.out.println("Money invested in TUFF COIN: " + tip);
        System.out.println("Your total is $" + total);

	}
}
