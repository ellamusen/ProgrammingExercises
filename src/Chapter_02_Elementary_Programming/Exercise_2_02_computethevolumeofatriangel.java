package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_02_computethevolumeofatriangel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Reading in the length of sides of an equilateral triangel and computing the area and volume");
        System.out.print("Enter length: "); // Prompt the user to enter a length

        double length  = input.nextDouble();

        double area = Math.sqrt(3) / 4 * length * length; // Find the square root of the number 3 (method) // The equations
        double volume = area * length; // The equation

        System.out.println("Arealet er " + area + " og volumen er " + volume); // Display result
    }
}
