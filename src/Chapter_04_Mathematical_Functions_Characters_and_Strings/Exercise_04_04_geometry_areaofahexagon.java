package Chapter_04_Mathematical_Functions_Characters_and_Strings;

import java.util.Scanner;

public class Exercise_04_04_geometry_areaofahexagon {

    public static void main(String[] args) {

        System.out.println("Geometry: Area of a hexagon");

        // Import scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Equation
        double area = (6 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 6));

        // Shorten decimals in console using Math.round
        area = Math.round(area*100) / 100.0;

        // Display result
        System.out.println("The area of the hexagon is " + area);
    }
}
