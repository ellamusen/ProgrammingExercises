package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_02_game_multiplythreenumbers {

    public static void main(String[] args) {

        System.out.println("Game: Multiply three numbers");

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 10 / 10 % 10);

        Scanner input = new Scanner(System.in); System.out.print(
                "What is " + number1 + " * " + number2 + " * " + number3 + " if you multiply it?: ");
        int answer = input.nextInt();

        System.out.println(
                number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " + (number1 * number2 * number3 == answer));
    }
}
