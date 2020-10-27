package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_05_findfurturedates {

    public static void main(String[] args) {

        System.out.println("Find future dates");

        // Prompt the user to enter an integer for today's day (Monday = 0 ... Sunday = 6)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Today's day is: " + days[today]);

        // Prompt the user to enter an integer for a future day from today's day
        System.out.print("Enter an integer for a future day from today's day: ");
        int futureday = (today + input.nextInt()) % 7;

        System.out.println("The future day is: " + days[futureday]);
    }
}
