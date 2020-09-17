package Chapter_2;

import java.text.*;
import java.util.Scanner;

public class Exercise_2_9_physics_acceleration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Physics: Acceleration");
        System.out.print("Enter v0, v1 and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The average acceleration is " + df.format(a) );

    }

}
