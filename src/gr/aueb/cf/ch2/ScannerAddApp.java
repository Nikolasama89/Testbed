package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo.Reads two integers from
 * the std (input) keyboard and calculates the result
 */

public class ScannerAddApp {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        // Εντολές
        System.out.println("Please enter two integers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;

        //Εκτύπωση
        System.out.printf("Το αθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);
    }
}
