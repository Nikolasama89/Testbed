package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives an integer and the output
 * gives a multiplication table
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
        int result = 0;


        System.out.println("Enter an integer:");
        inputNum = sc.nextInt();

        while (i <= 10) {
            result = i * inputNum;
            System.out.println(i + " * " + inputNum + " = " + result); // COULD DO IT IN THE SOUT(inputNum * i) instead result
            i++;
        }
    }
}
