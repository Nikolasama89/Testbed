package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a number: ");

        while ((inputNum = sc.nextInt())>= 0){
            positivesCount++;
            System.out.println("Please insert a number: ");
            inputNum = sc.nextInt();
        }

        System.out.println("Positives Count:" + positivesCount);
    }
}
