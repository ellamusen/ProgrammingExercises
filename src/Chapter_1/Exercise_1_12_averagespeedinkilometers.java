package Chapter_1;

public class Exercise_1_12_averagespeedinkilometers {

    public static void main(String[] args) {

        double miles = 24.0;
        double kilometer = miles * 1.6;

        double formula = (100.0 * 60.0 + 35.0) / (60.0 * 60.0);
        double kilometerPerHour = kilometer / formula;

        System.out.println(kilometerPerHour);

    }

}
