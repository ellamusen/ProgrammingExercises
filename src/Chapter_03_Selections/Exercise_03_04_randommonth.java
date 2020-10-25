package Chapter_03_Selections;

public class Exercise_03_04_randommonth {

    public static void main(String[] args) {

        System.out.println("Random month");

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int random = (int) (Math.random() * 11);

        System.out.println(months[random]);
    }
}
