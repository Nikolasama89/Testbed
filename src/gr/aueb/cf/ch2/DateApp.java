package gr.aueb.cf.ch2;

public class DateApp {

    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;

        System.out.println("H ημερομηνία ειναι : " + day + "/" + month + "/" + year);
        System.out.printf("H ημερομηνία ειναι : %02d/%02d/%d", day, month, year); // adds a zero if it's one digit
    }
}
