package Chapter_03_Selections;

import java.util.Random;
import java.util.Scanner;

public class Exercise_03_14_game_headsortailes {

    public static void main(String[] args) {

        System.out.println("Game: Heads or tails");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess between 0 (heads) and 1 (tails): ");
        int guess = input.nextInt();

        // Random int that only goes from 0 to 1
        int result = (int) (1 * Math.random());

        if (guess == result) {
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect");
        }
    }
}


