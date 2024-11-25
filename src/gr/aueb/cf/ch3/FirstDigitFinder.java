package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds the first digit(most significant digit) from the left
 * from a number user provided
 */

public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;



        System.out.println("Enter a positive number:");
        inputNum = sc.nextInt();

        tempNum = inputNum;
        while (tempNum >= 10) {
            tempNum /= 10;
        }
        System.out.println("The first digit of " + inputNum + " is " + tempNum);
    }
}
