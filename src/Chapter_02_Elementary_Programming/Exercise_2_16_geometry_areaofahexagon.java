package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_16_geometry_areaofahexagon {

    public static void main(String[] args) {

        System.out.println("Geometry: Area of a hexagon");

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the length of the side
        System.out.print("Enter the length of the side: ");
        double length = input.nextDouble();

        // Break up the equation
        double sqrt = 3 * Math.sqrt(3);
        double pow = Math.pow(length, 2);
        double area = (sqrt / 2) * pow;

        // Display result
        System.out.println("The area of the hexagon is " + area);
    }
}
