package Chapter_2;

import java.util.Scanner;

public class Exercise_2_8_currenttime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Current time");
        System.out.print("Enter the timezone offset to GMT: ");

        double gmt  = input.nextDouble();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);


    }

}
