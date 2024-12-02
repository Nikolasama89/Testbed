package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Converts a string into an integer.
 */

public class ParseIntApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Please insert an int");
        s = scanner.nextLine();
        num = Integer.parseInt(s); // converts string to integer

        System.out.println(num);
    }
}
