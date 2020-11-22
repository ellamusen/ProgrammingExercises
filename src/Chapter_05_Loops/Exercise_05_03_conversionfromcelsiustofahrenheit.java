package Chapter_05_Loops;

import java.awt.image.ColorConvertOp;
import java.text.DecimalFormat;

public class Exercise_05_03_conversionfromcelsiustofahrenheit {

    public static void main(String[] args) {

        System.out.println("Conversion from Celsius to Fahrenheit");

        System.out.println("\t");
        System.out.println("Celsius \tFahrenheit");
        for (double celsius = 0; celsius < 101; celsius += 2) {
            double fahrenheit = celsius * 9/5 + 32;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(celsius) + "\t\t\t" + df.format(fahrenheit));

        }
    }
}
