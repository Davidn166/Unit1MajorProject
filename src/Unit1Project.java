import  java.text.DecimalFormat;
import java.util.Scanner;
public class Unit1Project {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("Hello user.");
        //User Inputs
        System.out.print("Please enter your Bill Here: $");
        double bill = s.nextDouble();
        System.out.print("Please enter your Tip Percentage Here: %");
        double tipPercentage = s.nextDouble();
        System.out.print("Please enter your Party Amount Here: ");
        int totalPeople = s.nextInt();
        //Calculations
        double tipTotal = (bill / 100) * tipPercentage;
                double tipPerPerson = tipTotal / totalPeople;
                double totalBill = tipTotal + bill;
                double totalPerPerson = totalBill / totalPeople;
        //Output
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Your Total Tip is: $" + (df.format(Math.round(tipTotal*100.0)/100.0)));
        System.out.println("Your Tip Per Person is: $" + (df.format(Math.round(tipPerPerson*100.0)/100.0)));
        System.out.println("Your Total Per Person is: $" + (df.format(Math.round(totalPerPerson*100.0)/100.0)));
        System.out.println("Your Total Bill is: $" + (df.format(Math.round(totalBill*100.0)/100.0)));


    }
}
