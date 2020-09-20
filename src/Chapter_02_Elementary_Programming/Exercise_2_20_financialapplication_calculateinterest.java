package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_20_financialapplication_calculateinterest {

    public static void main(String[] args) {

        System.out.println("Financial application: Calculate interest");

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter balance and interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // The equation
        double interest = balance * (annualInterestRate/1200);

        // Display result
        System.out.println("The interest is " + interest);
    }
}
