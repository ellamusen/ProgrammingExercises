package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_13_financialapplication_compoundvalue {

    public static void main(String[] args) {

        System.out.println("Financial application: Compound value");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: "); // Prompt the user to enter the monthly saving amount
        double savings = input.nextDouble();
        double balance = 0; // Balance is equal to 0, because this value will be continuously overwritten in the loop
        double interestRate = (1 + 0.003125);

        int month = 6;
        for (int i = 1; i <= month; i++) {
            if (i == 1) { // The first month has its own equation, which is different in all the other months
                balance = savings * interestRate;
            }
            else { // The equation for every other month than the first
                balance = ((savings + balance) * interestRate); // The new balance equals the former balance
            }
            System.out.println("Month: " + i + "\tBalance: " + balance); // \t = tap // Display result
        }
    }
}
