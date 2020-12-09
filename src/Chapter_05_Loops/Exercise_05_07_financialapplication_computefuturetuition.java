package Chapter_05_Loops;

import java.text.DecimalFormat;

public class Exercise_05_07_financialapplication_computefuturetuition {

    public static void main(String[] args) {

        System.out.println("Financial application: compute future tuition");

        double intuition = 10000; // Value 1000 is to be overwritten in the loop, and is therefore placed outside loop

        for (int year = 0; year < 10; year++) { // Loop year from 0 to 10 (10 in total)
            DecimalFormat df = new DecimalFormat("#.##"); // Creating df, which is a DecimalFormat object and the object is used in the line below on the values that needs to be shortened
            System.out.println(df.format(year) + " " + df.format(intuition)); // Souting intuition before equation, to make sure that 10000 is displayed at year
            intuition = intuition * 1.06; // Intuition is overwritten when intuition value is partaking in the equation

        }
    }
}
