package gr.aueb.cf.ch7;

import java.util.Scanner;

public class IOStrApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings: ");
        s1 = scanner.next();    // reads till find whitespace(space, \t, \n)
        s2 = scanner.nextLine();  // reads till finds new line (\n).

        System.out.printf("s1: %s\n", s1);
        System.out.printf("s2: %s\n", s2);
    }
}
