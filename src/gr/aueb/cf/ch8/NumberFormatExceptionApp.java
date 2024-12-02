package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        try {


            System.out.println("Please insert an int");
            inputStr = scanner.nextLine();

            num = Integer.parseInt(inputStr);

            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Error. Input must be int!");
        }
    }
}
