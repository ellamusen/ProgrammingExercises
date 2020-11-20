package Chapter_04_Mathematical_Functions_Characters_and_Strings;

public class Exercise_04_03_geography_estimateareas {

    public static void main(String[] args) {

        System.out.println("Geography: estimate areas");

        // Not finished

        double charlotteNCx1 = 35.22770869;
        double savannahGAx2 = 32.0835407;
        double orlandoFLx3 = 28.5383355;
        double atlantaGAx4 = 33.7489954;
        double charlotteNCy1 = -80.8431267;
        double savannahGAy2 = -81.0998342;
        double orlandoFLy3 = -81.3792365;
        double atlantaGAy4 = -84.3879824;

        // Convert the degrees to radians
        charlotteNCx1 = Math.toRadians(charlotteNCx1);
        savannahGAx2 = Math.toRadians(savannahGAx2);
        orlandoFLx3 = Math.toRadians(orlandoFLx3);
        atlantaGAx4 = Math.toRadians(atlantaGAx4);
        charlotteNCy1 = Math.toRadians(charlotteNCy1);
        savannahGAy2 = Math.toRadians(savannahGAy2);
        orlandoFLy3 = Math.toRadians(orlandoFLy3);
        atlantaGAy4 = Math.toRadians(atlantaGAy4);

        double r = 6371.01;

        double d = (r * Math.acos((Math.sin(charlotteNCx1)) * Math.sin(savannahGAx2) * Math.sin(orlandoFLx3) * Math.sin(atlantaGAx4) +
                Math.cos(charlotteNCx1) * Math.cos(savannahGAx2) * Math.cos(orlandoFLx3) * Math.cos(atlantaGAx4) * Math.cos(charlotteNCy1 - savannahGAy2)));

        System.out.println("The distance between the four points is " + d + " km");

    }

}
