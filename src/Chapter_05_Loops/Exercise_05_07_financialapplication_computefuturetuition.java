package Chapter_05_Loops;

import java.text.DecimalFormat;

public class Exercise_05_07_financialapplication_computefuturetuition {

    public static void main(String[] args) {

        System.out.println("Financial application: compute future tuition");
        System.out.println("\t");
        System.out.println("Years " + "\t" + "Intuition"); // Creating two rows with Years and Intuition as headings


        double intuition = 10000; // Value 1000 is to be overwritten in the loop, and is therefore placed outside loop

        for (int year = 0; year < 10; year++) { // Loop year from 0 to 10 (10 in total)

            DecimalFormat df = new DecimalFormat("#.##"); // Creating df, which is a DecimalFormat object and the object is used in the line below on the values that needs to be shortened
            System.out.println(df.format(year) + " " + "\t\t" + df.format(intuition)); // Souting intuition before equation, to make sure that 10000 is displayed at year
            if (year == 9) break; // if is the last year, don't do the equation below, because it interferes with the next for loop
            intuition = intuition * 1.06; // Intuition is overwritten when intuition value is partaking in the equation
        }

        System.out.println("\t"); // Creating tab to keep the two results separate
        double total = 0; // Initializing with value, so we can overwrite it later

        for (int year = 10; year < 14; year++) {
            intuition = intuition * 1.06; // Overwriting intuition with new intuition
            total = total + intuition; // Overwriting total with new value // Taking new intuition and adding new value of total and creates a new total (does this 4 times)


        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("4 years worth of intuition after the 10th year is " + df.format(total) + " dollars"); // Display result of the 4 years worth of tuition after the 10th year
    }
}
