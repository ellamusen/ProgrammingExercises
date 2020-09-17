package Chapter_2;

import java.text.*;
import java.util.Scanner;

public class Exercise_2_9_physics_acceleration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Physics: Acceleration");
        // Prompt the user to enter the starting velocty (v0) in meters/second
        // Prompt the user to enter the ending velocity (v1) in meters/seconds
        // Prompt the user to enter and the time span in seconds
        System.out.print("Enter v0, v1 and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        // Shortens decimals in the console
        DecimalFormat df = new DecimalFormat("#.##");

        // Display result
        System.out.println("The average acceleration is " + df.format(a) );

    }

}
