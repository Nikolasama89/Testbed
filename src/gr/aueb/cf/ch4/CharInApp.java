package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * reads a char as a byte
 */

public class CharInApp {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.println("Enter a character: ");
        //ch = (char) System.in.read();
        ch = sc.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
