package Chapter_05_Loops;

import java.util.Scanner;

public class Exercise_05_01_passorfail {

    public static void main(String[] args) {

        System.out.println("Pass or fail");

        System.out.println("Please enter your score: ");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println("You pass the exam");
            System.exit(0);
        } else if (score <= 59 && score > 0) {
            System.out.println("You didn't pass the exam");
            System.exit(0);
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}

