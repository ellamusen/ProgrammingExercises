package Chapter_2;

import java.util.Scanner;

public class Exercise_2_07_findthenumberofyears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        final int minutes_day = 60*24;
        final int days_year = 365;

        int totalDays = minutes/minutes_day;
        int years = totalDays/days_year;
        int days = totalDays%days_year;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");


    }
}
