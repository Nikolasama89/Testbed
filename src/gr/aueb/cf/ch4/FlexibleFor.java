package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * DEMO FOR LOOP
 */

public class FlexibleFor {

    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step = 0;
        Scanner sc = new Scanner(System.in);
        int iterations = 0;

        System.out.println("Please give start, end, step values:");
        startVal = sc.nextInt();
        endVal = sc.nextInt();
        step = sc.nextInt();

        for (int i = startVal; i <= endVal; i+= step){
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterations : " + iterations);
    }
}
