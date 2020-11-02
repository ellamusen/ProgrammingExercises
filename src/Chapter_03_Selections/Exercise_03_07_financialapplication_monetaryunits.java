package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_07_financialapplication_monetaryunits {

    public static void main(String[] args) {

        System.out.println("Financial application: Monetary units");

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display amount of money
        System.out.println("Your amount " + amount + " consists of");

        // Display number of dollars
        if (numberOfOneDollars >= 1) {
            System.out.println(" " + numberOfOneDollars + " dollar");
        } else
            System.out.println(" " + numberOfOneDollars + " dollars");

        // Display number of quarters
        if (numberOfQuarters >= 1) {
            System.out.println(" " + numberOfQuarters + " quarter");
        } else
            System.out.println(" " + numberOfQuarters + " quarters");

        // Display number of dimes
        if (numberOfDimes >= 1) {
            System.out.println(" " + numberOfDimes + " dime");
        } else
            System.out.println(" " + numberOfDimes + " dimes");

        // Display number of nickles
        if (numberOfNickels >= 1) {
            System.out.println(" " + numberOfNickels + " nickle");
        } else
            System.out.println(" " + numberOfNickels + " nickles");

        // Display number of pennies
        if (numberOfDimes >= 1) {
            System.out.println(" " + numberOfPennies + " penny");
        } else
            System.out.println(" " + numberOfPennies + " pennies");
    }
}
