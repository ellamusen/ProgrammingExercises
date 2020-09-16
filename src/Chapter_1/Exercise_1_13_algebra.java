package Chapter_1;

public class Exercise_1_13_algebra {

    public static void main(String[] args) {

        double a, b, c, d, e, f;
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;
        double x = (e*d - b*f) / (a*d - b*c);
        double y = (a*f - e*c) / (a*d - b*c);

        System.out.printf("x=%f, y=%f", x, y );

    }

}
