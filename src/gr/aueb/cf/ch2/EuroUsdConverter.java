package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Takes an amount in euros from user
 * and prints the amount in Dollars and cents
 */

public class EuroUsdConverter {

    public static void main(String[] args) {
        int userEuro = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 96;
        Scanner sc= new Scanner(System.in);

        // Orders
        System.out.println("Please give amount in euros: ");
        userEuro = sc.nextInt();

        totalUsaCents = userEuro * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("The result of %d euros in dollars is : %d , %d $", userEuro, usaDollars, usaCents);
    }
}
