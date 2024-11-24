package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Gets a temperature from the user
 * and shows a message
 */

public class TempApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("Please insert current temperature: ");
        temp = sc.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
