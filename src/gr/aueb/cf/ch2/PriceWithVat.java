package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates price with VAT
 */

public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double user_price = 0.0;
        double totalPrice = 0.0;
        double vat = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price:");
        user_price = sc.nextDouble();

        vat = user_price * VAT_RATE;
        totalPrice = user_price + vat;

        System.out.printf("The total price with VAT is: %.2f, The Vat is: %.2f\n", totalPrice, vat);
    }
}
