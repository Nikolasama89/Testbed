package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years(age) to days.
 */

public class YearsToDays {

    public static void main(String[] args) {
        final int DAYS_PER_YEAR = 365;
        Scanner sc = new Scanner(System.in);
        int userAge = 0;
        int userAgeInDays = 0;

        System.out.println("Please insert your Age: ");
        userAge = sc.nextInt();

        userAgeInDays = userAge * DAYS_PER_YEAR;

        System.out.printf("Your age in days is: %d%n", userAgeInDays);
    }
}
