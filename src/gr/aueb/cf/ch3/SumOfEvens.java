package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of even numbers
 * from 2 up to user input
 */

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Insert upper limit");
        inputNum = sc.nextInt();

        while (i <= inputNum) {
            sum += i ;
            i+=2;
        }
        System.out.println("The sum of the even : " + sum);
    }
}
