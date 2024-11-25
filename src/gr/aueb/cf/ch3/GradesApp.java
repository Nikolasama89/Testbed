package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User will provide:
 * 1.Total grades number
 * 2. How many lessons had
 *
 * Program will calculate and grade
 * "Excellent" if grade > = 9
 * "Very Good" if grade > = 7
 * "Good" if grade >= 5 and
 * "Fail" if grade < 5.
 *
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int totalLessons = 0;
        int average = 0;

        System.out.println("Please insert total marks: ");
        totalMarks = sc.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Marks must not be zero");
            System.exit(1);
        }
        System.out.println("Please insert courses count: ");
        totalLessons = sc.nextInt();

        if (totalLessons <= 0) {
            System.out.println("Lessons must not be zero or negative");
            System.exit(1);
        }

        average = totalMarks / totalLessons;

        if (average > 10) {
            System.out.println("The average must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent!");
        } else if (average >= 7) {
            System.out.println("Very good!");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
    }
}
