package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_21_financialapplication_calculatefutureinvestmentvalue {

    public static void main(String[] args) {

        System.out.println("Financial application: Calculate future investment value");

        Scanner input = new Scanner(System.in);


        // Prompt user to enter investment amount, annual interest rate and number of years
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200; // Is the same as --> monthlyInterestRate = monthlyInterestRate / 1200;

        System.out.print("Enter a number of years: ");
        double year = input.nextDouble();


        // The equation
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, year * 12);

        // Display result
        System.out.print("Future value is $" + futureInvestmentValue);
    }
}
