package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Insert a num");
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            try {
                if (scanner != null) scanner.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
