package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            System.out.println("Please provide two integers");
            num1 = in.nextInt();
            num2 = in.nextInt();

            result = add(num1, num2);
            System.out.println("Sum: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input must be integers");
        } catch (Exception e) {
            System.out.println("Error at calculation. Can not have division with 0");
        }
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

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be 0");
            return a / b;

        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            throw e;
        }
    }

    public static int mod(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be 0");
            return a % b;

        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
            throw e;
        }
    }
}
