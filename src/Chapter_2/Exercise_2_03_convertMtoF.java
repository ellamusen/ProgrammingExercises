package Chapter_2;

import java.util.Scanner;

public class Exercise_2_03_convertMtoF {

    public static void main(String[] args) {

        System.out.println("Convert meters into feet");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: "); // Prompt user to enter a value for meter

        double meter = input.nextDouble();

        double feet = meter * 3.2786; // The equation

        System.out.println(meter + " meter er " + feet + " feet!"); // Display result
    }
}
