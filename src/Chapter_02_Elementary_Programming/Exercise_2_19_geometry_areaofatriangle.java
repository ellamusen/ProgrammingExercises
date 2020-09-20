package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_19_geometry_areaofatriangle {

    public static void main(String[] args) {

        System.out.println("Geometry: Area of a triangle");

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three points separated by spaces
        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        // Initialising variables
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculating side 1, 2 and 3 to shorten equation below
        double s1 = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2),0.5);
        double s2 = Math.pow(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2),0.5);
        double s3 = Math.pow(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2),0.5);

        // Breaking up the equation
        double s = (s1 + s2 + s3)/2;
        double area = Math.sqrt(s * (s - s1) * (s -  s2) * (s - s3));

        // Display result
        System.out.println("The area of the triangle is " + area);
    }
}
