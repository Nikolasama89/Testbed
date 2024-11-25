package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET_NUM = 12;
        boolean isFound = false;

        do {
            System.out.println("Please insert a num to guess the secret: ");
            inputNum = sc.nextInt();

            if (inputNum == SECRET_NUM) {
                System.out.println("You found it!!!");
                isFound = true;
            } else {
                System.out.println("Try Again!");
            }
        } while (!isFound);
    }
}
