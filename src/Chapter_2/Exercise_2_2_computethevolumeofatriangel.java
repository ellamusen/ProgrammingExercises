package Chapter_2;

import java.util.Scanner;

public class Exercise_2_2_computethevolumeofatriangel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Reading in the length of sides of an equilateral triangel and computing the area and volume");
        System.out.print("Insert length: ");

        double length  = input.nextDouble();

        double area = Math.sqrt(3) / 4 * length * length;
        double volume = area * length;

        System.out.println("Arealet er " + area + " og volumen er " + volume);
    }

}
