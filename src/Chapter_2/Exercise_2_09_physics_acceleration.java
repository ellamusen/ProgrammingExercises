package Chapter_2;

import java.text.*;
import java.util.Scanner;

public class Exercise_2_09_physics_acceleration {

    public static void main(String[] args) {

        System.out.println("Physics: Acceleration");

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the starting velocity (v0) in meters/second
        // Prompt the user to enter the ending velocity (v1) in meters/seconds
        // Prompt the user to enter and the time span (t) in seconds
        System.out.print("Enter v0, v1 and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t; // The equation


        DecimalFormat df = new DecimalFormat("#.##"); // Shortens decimals in the console

        System.out.println("The average acceleration is " + df.format(a) ); // Display result
    }
}
