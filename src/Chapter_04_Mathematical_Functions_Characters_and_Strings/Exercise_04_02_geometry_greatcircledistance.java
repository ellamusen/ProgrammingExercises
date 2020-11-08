package Chapter_04_Mathematical_Functions_Characters_and_Strings;

import java.util.Scanner;

public class Exercise_04_02_geometry_greatcircledistance {

    public static void main(String[] args) {

        System.out.println("Geometry: Great circle distance");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Convert the degrees to radians
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        double r = 6371.01;

        double d = (r * Math.acos((Math.sin(x1)) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

        System.out.println("The distance between the two points is " + d + " km");

    }

}
