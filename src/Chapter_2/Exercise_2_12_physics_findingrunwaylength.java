package Chapter_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_2_12_physics_findingrunwaylength {

    public static void main(String[] args) {

        System.out.println("Psychics: Finding runway length");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: "); // Prompt the user to enter v in meters/seconds and the acceleration a in meters/second squared
        double v = input.nextDouble(); // Take-off speed
        double a2 = input.nextDouble(); // Acceleration

        double length = (v * v) / (a2 * 2); // Formula

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("The minimum runway length for this airplane is  " + df.format(length));

    }
}
