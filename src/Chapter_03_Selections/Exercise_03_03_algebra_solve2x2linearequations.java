package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_03_algebra_solve2x2linearequations {

    public static void main(String[] args) {

        System.out.println("Algebra: Solve 2 X 2 linear equations");

        System.out.print("Enter a, b, c,  d, e and f: ");
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double adbc = (a * d) -(b * c);
        double x = ((e * d) - (b * f)) / (adbc);
        double y = ((a * f) - (e * c)) / (adbc);

        if (adbc == 0) {
            System.out.println("The equation has no solution");
            System.exit(0);
        }

        System.out.println("x is " + x  + " and y is " + y);
    }
}
