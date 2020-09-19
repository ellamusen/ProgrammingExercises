package Chapter_2;

import java.util.Scanner;

public class Exercise_2_14_healthapplication_computingBMI {

    public static void main(String[] args) {

        System.out.println("Health application: Computing BMI");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: "); // Prompt the user to enter weight in pounds
        double weight = poundToKilograms(input.nextDouble()); // Get the converted value
        System.out.print("Enter height in inches: "); // Prompt the user to enter height in inches
        double height = inchesToMeters(input.nextDouble());

        double bmi = weight / (height * height); // The equation for body mass index

        System.out.println("BMI is " + bmi); // Display result

    }

    // Method for converting pounds to kilograms
    public static double poundToKilograms(double pound) {
        return pound * 0.45359237; // This is what is being returned to the main method
    }

    // Method for converting inches to meters
    public static double inchesToMeters(double inches) {
        return inches * 0.0254; // This is what is being returned to the main method
    }
}
