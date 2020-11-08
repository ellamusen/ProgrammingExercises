package Chapter_04_Mathematical_Functions_Characters_and_Strings;

import java.util.Scanner;

public class Exercise_04_01_geometry_areaofapentagon {

    public static void main(String[] args) {

        System.out.println("Geometry: Area of a pentagon");

        // Import scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter length
        System.out.print("Enter the length from the center of a pentagon to a vertex: ");
        double r = input.nextDouble();

        // Equations
        double s = (2 * r) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s,2)) / (4* Math.tan((Math.PI / 5)));

        // Shorten decimals in console using Math.round
        area = Math.round(area*100) / 100.0;

        // Display result
        System.out.println("The area of the pentagon is " + area);
    }
}
