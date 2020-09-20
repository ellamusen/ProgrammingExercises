package Chapter_01_Introduction;

public class Exercise_1_10_averagespeedinmiles {

    private static double kilometer = 14.0;
    private static double mil = kilometer / 1.6;

    public static void main(String[] strings) {

        double formula = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double milesPerHour = mil / formula;

        System.out.println(milesPerHour);
    }

}
