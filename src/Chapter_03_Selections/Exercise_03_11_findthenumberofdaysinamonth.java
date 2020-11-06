package Chapter_03_Selections;

import java.util.Scanner;

public class Exercise_03_11_findthenumberofdaysinamonth {

    public static void main(String[] args) {

        System.out.println("Find the number of days in a month");

        System.out.print("Enter the month and year: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (year % 4  == 0 && month == 2){
                System.out.println(months[month-1] + " " + year + " has 29 days");
        }
        else if (month == 2){
            System.out.println(months[month-1] + " " + year + " has 28 days");
        }
        else if (month % 2 == 0 || month == 1){
            System.out.println(months[month-1] + " " + year + " has 31 days");
        }
        else if (month % 2 == 1){
            System.out.println(months[month-1] + " " + year + " has 30 days");
        }
    }
}
