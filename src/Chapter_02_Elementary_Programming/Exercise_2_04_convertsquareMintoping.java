package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_04_convertsquareMintoping {

    public static void main(String[] args) {

        System.out.println("Convert square meters to ping");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: "); // Prompt user to enter a number in square meters

        double squaremeter = input.nextDouble();

        double ping = squaremeter * 0.3025; // The equation

        System.out.println(squaremeter + " square meter is " + ping + " pings!"); // Display result
    }
}
