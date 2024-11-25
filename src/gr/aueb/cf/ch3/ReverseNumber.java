package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Reverse integer user provides
 * example 123 ---> 321
 */

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = 0;
        int tempNum = 0;
        int reversed = 0;
        int rightDigit;

        System.out.println("Enter a digit: ");
        numInput = sc.nextInt();

        tempNum = numInput;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
