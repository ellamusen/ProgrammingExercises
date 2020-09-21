package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_06_multiplythedigitsinaninteger {

    public static void main(String[] args) {

        System.out.println("Multiply the digits in an integer");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int integer = input.nextInt();

        int lessThan10 = integer % 10;
        integer /= 10;
        int tens = integer % 10;
        integer /= 10;
        int hundreds = integer % 10;

        int sum = hundreds + tens + lessThan10; // The equation

        System.out.println("The sum of the digits is " + sum); // Display result
    }
}
