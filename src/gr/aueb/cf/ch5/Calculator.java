package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Displays a menu with options ( Sum, subtract...)
 * User choose one option
 * Based on users choice
 * result is printing
 * Loop continues until user hits
 * Exit
 */

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Insert a number between 1-6");
                continue;
            }

            if (choice == 6) {
                System.out.println("Quitting.......");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Mod Division");
        System.out.println("6. Exit");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice <= 6 && choice >= 1;

    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please give two integers");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error in Choice");
                break;

        }
        return result;

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b==0) return 0;
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b==0) return 0;
        return a % b;
    }

}
