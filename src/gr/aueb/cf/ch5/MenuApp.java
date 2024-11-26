package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = sc.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error!Please give a valid choice.");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Insert process");
                break;
            case 2:
                System.out.println("Delete process");
                break;
            case 3:
                System.out.println("Search process");
                break;
            case 4:
                System.out.println("Update process");
                break;
            case 5:
                System.out.println("Quiting....");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}