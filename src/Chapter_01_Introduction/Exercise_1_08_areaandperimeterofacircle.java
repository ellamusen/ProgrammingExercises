package Chapter_01_Introduction;

public class Exercise_1_08_areaandperimeterofacircle {

    public static void main(String[] args) {

        // assign value
        double radius = 5.5;

        // Math.PI = constant = No change in value
        double perimeter = 2 * radius * Math.PI;

        System.out.println(perimeter);


        double area = radius * radius * Math.PI;

        System.out.println(area);

    }

}
