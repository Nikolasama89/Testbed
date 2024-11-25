package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Show a menu at least one
 */

public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Quit");
            choice = sc.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the Menu App.");
    }
}
