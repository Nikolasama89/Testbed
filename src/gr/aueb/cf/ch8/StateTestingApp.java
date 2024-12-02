package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator");
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Input must be int. Insert numerator.");
        }
        numerator = scanner.nextInt();

        System.out.println("Please insert denominator");
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Input must be int. Insert denominator.");
        }
        denominator = scanner.nextInt();

        if (denominator == 0) {     //state test
            System.out.println("Error. Denominator must not be 0.");
            System.exit(1);
        }

        result = numerator / denominator;

        System.out.printf("%d / %d = %d\n", numerator, denominator, result);

    }


}
