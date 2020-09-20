package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_07_findthenumberofyears {

    public static void main(String[] args) {

        System.out.println("Find the number of years");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        final int minutes_day = 60*24; // final = cannot change int value
        final int days_year = 365; // final = cannot change int value

        // The equations
        int totalDays = minutes/minutes_day;
        int years = totalDays/days_year;
        int days = totalDays%days_year;

        // Display result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
