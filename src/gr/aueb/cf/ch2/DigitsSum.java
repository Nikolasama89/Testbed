package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Takes input from the user a two digits integer
 * and gives us the sum of these two digits
 */

public class DigitsSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int firstDigit = 0;
        int secondDigit = 0;
        int sum = 0;

        System.out.println("Give a two digits integer: ");
        userInput = sc.nextInt();
        firstDigit = userInput / 10;
        secondDigit = userInput % 10;
        sum = firstDigit + secondDigit;

        System.out.printf("The sum of %d and %d is : %d\n", firstDigit, secondDigit, sum);
    }
}
