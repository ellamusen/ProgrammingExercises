package Chapter_2;

import java.util.Scanner;

public class Exercise_2_03_convertMtoF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Converting meters into feet");
        System.out.print("Enter a value for meter: ");

        double meter = input.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(meter + " meter er " + feet + " feet!");
    }
}
