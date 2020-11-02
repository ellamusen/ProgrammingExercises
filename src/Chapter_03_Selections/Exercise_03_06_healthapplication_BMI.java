package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_06_healthapplication_BMI {

    public static void main(String[] args) {

        System.out.println("Health application: BMI");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: "); // Prompt the user to enter weight in pounds
        double weight = input.nextDouble();
        System.out.print("Enter height in feet: "); // Prompt the user to enter height in feet
        double heghtinfeet = input.nextDouble();
        System.out.print("Enter height in inches: "); // Prompt the user to enter height in inches
        double heightininches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_FEET = 0.3048; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (heghtinfeet * METERS_PER_FEET) + (heightininches * METERS_PER_INCH);
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
