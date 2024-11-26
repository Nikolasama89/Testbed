package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseFallThrough {

    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a grade");
        grade = sc.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very Good");
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
        }
    }
}
