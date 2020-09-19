package Chapter_2;

import java.util.Scanner;

public class Exercise_2_17_science_windchilltempature {

    public static void main(String[] args) {

        System.out.println("Science: Wind-chill temperature");

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double tempFahr = input.nextDouble();

        // Prompt user to enter wind speed in miles per hour
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeedMph = input.nextDouble();

        // Equation
        double windChillIndex = 35.74 + 0.6215 * tempFahr - 35.75 * Math.pow(windSpeedMph,0.16) + 0.4275 * tempFahr * Math.pow(windSpeedMph,0.16);

        // Display result
        System.out.printf("The wind chill index is: %.5f%n", windChillIndex);
    }
}
