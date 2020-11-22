package Chapter_05_Loops;

import java.text.DecimalFormat;

public class Exercise_05_04_conversionfrominchtocentimeter {

    public static void main(String[] args) {

        System.out.println("Conversion from inch to centimeter");

        System.out.println("\t");
        System.out.println("Inch \t\tCentimeter");
        for (double inch = 1; inch < 11; inch++) {
            double centimeter = inch * 2.54;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println(df.format(inch) + "\t\t\t" + df.format(centimeter));
        }

    }

}
