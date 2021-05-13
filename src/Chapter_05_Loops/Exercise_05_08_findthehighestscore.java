package Chapter_05_Loops;

import java.util.Scanner;

public class Exercise_05_08_findthehighestscore {

    public static void main(String[] args) {

        System.out.println("Find the highest score");
        System.out.println("\t");

        Scanner input = new Scanner(System.in);
        String nameOfStudent = "";

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        for (int i = 0; i <= numberOfStudents-1; i++) {
            System.out.print("Enter students name: ");
            nameOfStudent = input.next();
        }
        System.out.println("Enter each students name and score: ");



    }

}
