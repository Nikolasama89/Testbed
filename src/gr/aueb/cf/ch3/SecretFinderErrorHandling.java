package gr.aueb.cf.ch3;

/**
 * Linearize the branches and
 * checks for error first
 */

import java.util.Scanner;

public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET_NUM = 12;
        boolean isFound = false;

        while (true){
            System.out.println("Please insert a num to guess the secret: ");
            inputNum = sc.nextInt();

            if (inputNum != SECRET_NUM){
                System.out.println("Try Again!");
                continue;
            }
            System.out.println("Bingo!");
            break;
        }
    }
}
