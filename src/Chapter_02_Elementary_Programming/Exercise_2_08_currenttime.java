package Chapter_02_Elementary_Programming;

import java.util.Scanner;

public class Exercise_2_08_currenttime {

    public static void main(String[] args) {

        System.out.println("Current time");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT: ");
        double gmt  = input.nextDouble();

        // Get current milliseconds to calculate the other time units below
        long totalMilliseconds = System.currentTimeMillis();

        // Calculations
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        // Display the result
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
