package Chapter_2;

import java.util.Scanner;

public class Exercise_2_06_multiplythedigitsininteger {

    public static void main(String[] args) {

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
