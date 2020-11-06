package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_12_palindromeinteger {

    public static void main(String[] args) {

        System.out.println("Palindrome integer");

        System.out.print("Enter a three-digit integer: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (number == reversed) {
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
