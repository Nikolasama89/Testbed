package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts days
 * to total seconds. User gives data and
 * it's printing the output.
 */

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        int userDays = 0;
        int totalHours;
        int totalMinutes;
        int totalSeconds = 0;
        final int DAY_HOURS = 24;
        final int MINUTES = 60;
        final int SECONDS = 60;
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me an integer in Days: ");
        userDays = sc.nextInt();
        totalHours = userDays * DAY_HOURS;
        totalMinutes = totalHours * MINUTES;
        totalSeconds = totalMinutes * SECONDS;

        System.out.printf("Total time in seconds is %,d", totalSeconds);
    }
}
