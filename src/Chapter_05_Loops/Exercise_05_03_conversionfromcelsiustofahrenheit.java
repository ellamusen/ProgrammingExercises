package Chapter_05_Loops;

import java.awt.image.ColorConvertOp;

public class Exercise_05_03_conversionfromcelsiustofahrenheit {

    public static void main(String[] args) {

        System.out.println("Conversion from Celsius to Fahrenheit");

        System.out.println("\t");
        System.out.println("Celsius \t Fahrenheit");
        for (double celsius = 0; celsius < 101; celsius += 2) {
            double fahrenheit = celsius * 9/5 + 32;
            System.out.println(celsius + "\t\t\t" + fahrenheit);
        }
    }
}
