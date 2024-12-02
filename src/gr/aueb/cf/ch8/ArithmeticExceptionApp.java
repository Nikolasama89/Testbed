package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator and a denominator");
                numerator = scanner.nextInt();
                if (numerator == 0) break;

                denominator = scanner.nextInt();
                result = numerator / denominator;

                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator must not be zero.");
            }

        }
        System.out.println("Thanks for using the App!");
    }
}
