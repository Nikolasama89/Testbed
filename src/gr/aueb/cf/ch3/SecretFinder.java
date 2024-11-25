package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * There is a SECRET that is an integer
 * and the user tries to find it with only one try
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET_NUM = 12;

        System.out.println("Please insert a num to guess the secret: ");
        inputNum = sc.nextInt();

        if (inputNum == SECRET_NUM) {
            System.out.println("You found it!!!");
        } else {
            System.out.println("Failure!!");
        }

    }
}
