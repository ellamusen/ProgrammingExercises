package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_3_01_algebra_solvequadraticequations {

    public static void main(String[] args) {

        System.out.println("Algebra: Solve quadratic equations");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double y = Math.pow(b,2) - (4 * a * c);
        double r1 = ((-b + Math.sqrt(y))) / (2 * a);
        double r2 = ((-b - (Math.sqrt(y))) / (2 * a));

        if (y >= 1) {
            System.out.print("The equation has two real roots: " + r1 + " and " + r2);
        }
        else if (y == 0) {
            System.out.print("The equation has one root: " + r1);
        }
        else {
            System.out.print("The equation has no real roots");
        }
    }
}
