package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks if an integer the user provide is even
 */

public class IsEvenApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("Insert a number");
        num = sc.nextInt();

        //isEven
        isEven = num % 2 == 0;

        System.out.printf("%d Is Even: %b ",num,  isEven);
    }
}
