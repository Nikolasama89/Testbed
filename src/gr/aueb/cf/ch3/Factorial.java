package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input number: ");
        inputNum = sc.nextInt();

        while(i <= inputNum){
            facto *= i;
            i++;
        }

        System.out.println("The factorial is: " + facto);
    }
}
