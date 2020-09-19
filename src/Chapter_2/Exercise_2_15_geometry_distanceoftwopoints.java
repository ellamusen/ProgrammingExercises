package Chapter_2;

import java.util.Scanner;

public class Exercise_2_15_geometry_distanceoftwopoints {

    public static void main(String[] args) {

        System.out.println("Geometry: Distance of two points");

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an x variable and a y variable
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // Prompt the user to enter an x variable and a y variable
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Breaking up the equation
        double x = Math.pow(x2 - x1, 2);
        double y = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(x + y);

        // Display result
        System.out.println("The distance between the two points is " + result);
    }
}
