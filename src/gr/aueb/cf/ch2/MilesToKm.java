package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts miles to km
 */

public class MilesToKm {

    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometers = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert miles:");
        inputMiles = sc.nextDouble();

        kilometers = inputMiles * KM_PER_MILE;

        System.out.printf("Miles: %.1f , Kilometers: %.1f", inputMiles, kilometers);
    }

}
