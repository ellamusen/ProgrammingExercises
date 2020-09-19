package Chapter_1;

public class Exercise_1_07_approximatepi {

    public static void main(String[] args) {

        double pi = 4 * (1.0 - (1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));

        System.out.println(pi);

        double pies = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println(pies);


    }

}
