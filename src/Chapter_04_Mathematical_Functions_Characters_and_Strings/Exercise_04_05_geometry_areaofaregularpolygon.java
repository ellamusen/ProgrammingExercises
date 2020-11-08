package Chapter_04_Mathematical_Functions_Characters_and_Strings;

import java.util.Scanner;

public class Exercise_04_05_geometry_areaofaregularpolygon {

    public static void main(String[] args) {

        System.out.println("Geometry: Area of a regular polygon");

        // Import scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of sides
        System.out.print("Enter the number of the sides: ");
        double n = input.nextDouble();

        // Prompt the user to enter the side of the polygon
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Equation
        double area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI / n));

        // Display output
        System.out.println("The area of the polygon is " + area);
    }
}
