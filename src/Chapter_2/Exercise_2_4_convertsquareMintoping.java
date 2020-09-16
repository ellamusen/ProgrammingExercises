package Chapter_2;

import java.util.Scanner;

public class Exercise_2_4_convertsquareMintoping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Converting square meters into ping");
        System.out.print("Enter a number in square meters: ");

        double squaremeter = input.nextDouble();

        double ping = squaremeter * 0.3025;

        System.out.println(squaremeter + " square meter is " + ping + " pings!");
    }

}
