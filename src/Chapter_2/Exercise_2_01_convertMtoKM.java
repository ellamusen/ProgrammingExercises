package Chapter_2;

import java.util.Scanner;

public class Exercise_2_01_convertMtoKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Converting miles into kilometers");
        System.out.print("Insert miles: ");

        // The number entered in Input in the Terminal = Mile
        double mile  = input.nextDouble();

        double kilometers = mile * 1.6;

        System.out.println(mile + " miles are " + kilometers + " kilometers!");
    }
}
