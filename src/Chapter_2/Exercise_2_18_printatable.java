package Chapter_2;

public class Exercise_2_18_printatable {

    public static void main(String[] args) {

        System.out.println("Print a table");

        System.out.println("a\t\t\tb\t\t\tMiddle point");

        // Setup points (array list)
        double[] first = middlePoint(0,0,2,1);
        double[] second = middlePoint(1,4,4,2);

        // Display result
        System.out.printf("(0, 0)\t\t(2, 1)\t\t(%.2f, %.2f)\n",first[0],first[1]);
        System.out.printf("(1, 4)\t\t(4, 2)\t\t(%.2f, %.2f)\n",second[0],second[1]);

    }

    // Method for calculating middle points
    public static double[] middlePoint(double x1, double y1, double x2, double y2){
        double[] result = new double[2];
        result[0] = (x1 + x2) / 2;
        result[1] = (y1 + y2) / 2;
        return result;
    }
}
