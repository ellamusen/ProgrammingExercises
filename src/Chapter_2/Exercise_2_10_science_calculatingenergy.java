package Chapter_2;

import java.util.Scanner;

public class Exercise_2_10_science_calculatingenergy {

    public static void main(String[] args) {

        System.out.println("Science: Calculating energy");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: "); // Prompt the user to enter value
        double m = input.nextDouble(); // The weight of water in kilograms

        System.out.print("Enter the initial temperature of the water: "); // Prompt the user to enter value
        double initialTemperature = input.nextDouble(); // Temperature measured in Celsius

        System.out.print("Enter the final temperatures of the water: "); // Prompt the user to enter value
        double finalTemperature = input.nextDouble(); // Temperature measured in Celsius


        double q = m * (finalTemperature - initialTemperature) * 4184; // Formula (Energy Q is measured in joules)

        System.out.println("The energy needed is " + q); // Display
    }
}

