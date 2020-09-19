package Chapter_2;

import java.util.Scanner;

public class Exercise_2_01_convertMtoKM {

    public static void main(String[] args) {

        System.out.println("Converting miles into kilometers");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: "); // Prompt the user to enter miles

        // The number entered in Input in the console = Mile
        double mile  = input.nextDouble();

        double kilometers = mile * 1.6; // Converting kilometers to miles

        System.out.println(mile + " miles are " + kilometers + " kilometers!"); // Display result
    }
}
