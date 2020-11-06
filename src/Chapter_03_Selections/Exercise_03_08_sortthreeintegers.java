package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_08_sortthreeintegers {

    public static void main(String[] args) {

        System.out.println("Sort three integers");

        // Prompt user to enter three integers
        System.out.print("Enter three integers: ");

        // Create scanner
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Sort numbers
        int temp; // temp variable has been declared with no value
        if (number2 < number1 || number3 < number1) { // if number2 is smaller than number1 OR if number3 smaller than number1
            if (number2 < number1) { // if number2 is smaller than number 1
                temp = number1; // temp variable is empty = Place number1 value in temp
                number1 = number2; // number1 variable is ready to be replaced with a new value = Place number2 value in number1 variable
                number2 = temp; // number2 variable is ready to be replaced with a new value = place temp value (number1 value) = Therefore the values number1 and number2 has been switched
            }
            if (number3 < number1) { // if number3 is smaller than number1
                temp = number1; // temp variable is empty = Place number1 value in temp
                number1 = number3; // number1 variable is ready to be replaced with a new value = Place number3 value in number1 variable
                number3 = temp; // number3 variable is ready to be replaced with a new value = place temp value (number1 value) = Therefore the values number1 and number3 has been switched
            }
        }
        if (number3 < number2) { // if number3 is smaller than number2
            temp = number2; // temp variable is empty = Place number2 value in temp
            number2 = number3; // number2 variable is ready to be replaced with a new value = Place number3 value in number2 variable
            number3 = temp; // number3 variable is ready to be replaced with a new value = place temp value (number2 value) = Therefore the values number2 and number3 has been switched
        }

        // Display numbers in ascending order (lower to higher value)
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
