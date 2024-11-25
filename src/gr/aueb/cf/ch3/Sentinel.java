package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives Count
 */

public class Sentinel {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a number: ");
        inputNum = sc.nextInt();

        while (inputNum >= 0){
            positivesCount++;
            System.out.println("Please insert a number: ");
            inputNum = sc.nextInt();
        }

        System.out.println("Positives Count:" + positivesCount);
    }
}
