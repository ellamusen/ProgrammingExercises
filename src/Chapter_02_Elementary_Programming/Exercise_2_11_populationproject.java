package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_11_populationproject {

    public static void main(String[] args) {

        System.out.println("Population project");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: "); //Prompt the user to enter number of years
        int year = input.nextInt();

        // The variables used in the equations
        int time = 3600 * 24 * 365;
        int born = time / 7;
        int death = time / 13;
        int immigrant = time / 45;

        // The equation
        int current_population = 312032486;
        int population = born + immigrant - death;

        // As long as 'i' is equal to or smaller than 'year' (the condition), 1 will be added to 'i' until the condition is met
        for (int i = 1; i <= year; i++) {
            current_population = current_population + population;
            // When 'i' is finally equal to 'year', the program will print the message below
            if (i == year) {
                System.out.println(i + " year population is : " + current_population); // Display result
            }
        }
    }
}
