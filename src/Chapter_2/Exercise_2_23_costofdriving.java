package Chapter_2;

import java.util.Scanner;

public class Exercise_2_23_costofdriving {

    public static void main(String[] args) {

        System.out.println("Cost of driving");

        Scanner input = new Scanner(System.in);

        //  Prompt the user to enter driving distance, miles per gallon and price per gallon
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPrGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePrGallon = input.nextDouble();

        // The equation
        double cost = (distance / milesPrGallon) * pricePrGallon;

        // Display result
        System.out.println("The cost of driving is " + cost);
    }
}
