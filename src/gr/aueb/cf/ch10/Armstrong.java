package gr.aueb.cf.ch10;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int digitsCount = 0;
        int originalNum;
        int digit;

        System.out.println("Please enter an integer");
        num = scanner.nextInt();
        digitsCount = String.valueOf(num).length();
        originalNum = num;

        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, digitsCount);
            num /= 10;
        }
        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum)? " is " : " is not");
        }
}

