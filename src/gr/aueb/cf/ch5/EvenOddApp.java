package gr.aueb.cf.ch5;

public class EvenOddApp {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Number " + num + " is Even: "+ isEven(num) + ".");
        System.out.println("Number " + num + " is Odd: "+ isOdd(num) + ".");

    }

    /**
     * Delegation Design Pattern
     *
     * @param num
     * @return
     */

    public static boolean isEven(int num) {
        return num % 2 == 0;

    }

    public static boolean isOdd (int num) {
        return !isEven(num);
    }

}
