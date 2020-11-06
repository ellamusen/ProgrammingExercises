package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_10_game_multiplication_quiz {

    public static void main(String[] args) {

        System.out.println("Game: Multiplication quiz");

        // 1. Generate two random single-digit integers int number1 = (int)(Math.random() * 10);
        for (int i = 0; i < 3; i++) {
            int number1 = (int) (1000 * Math.random());

            for (int j = 0; j < 3; j++) {
                int number2 = (int) (1000 * Math.random());
                int total = number1 * number2;

                // 3. Prompt the student to answer "What is number1 * number2?"
                System.out.print("What is " + number1 + " * " + number2 + "? ");
                Scanner input = new Scanner(System.in);
                int answer = input.nextInt();

                // 4. Grade the answer and display the result
                if (number1 * number2 == answer)
                    System.out.println("You are correct!");
                else
                    System.out.println("Your answer is wrong.");
                System.out.println(number1 + " * " + number2 + " is " + (number1 * number2));
            }
        }
    }
}

