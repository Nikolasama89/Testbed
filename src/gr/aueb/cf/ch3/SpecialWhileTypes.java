package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SpecialWhileTypes {

    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while ((num= sc.nextInt()) >= 0);

        while (i <= 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i < 1) {
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("Gets in one time");
            i++;
        }

        while (true) {
            System.out.println("Eternal loop");
        }
    }
}
