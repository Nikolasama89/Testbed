package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of digits user provided
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = 0;
        int sum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive Integer: ");
        inputNumber = sc.nextInt();

        tempNum = inputNumber; // creating tempNum because of the divisions our inputNumber ends 0.
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;

        }
        System.out.println("The sum of digits of " + inputNumber + " is " + sum);
    }
}
