package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at the console.
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        // ΔΗΛΩΣΗ ΚΑΙ ΑΡΧΙΚΟΠΟΙΗΣΗ ΜΕΤΑΒΛΗΤΩΝ
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        //ΕΝΤΟΛΕΣ
        result = num1 + num2;

        // ΕΚΤΥΠΩΣΗ ΑΠΟΤΕΛΕΣΜΑΤΟΣ
        System.out.println("To αποτέλεσμα ειναι: " + result);
        System.out.println("To αθροισμα των " + num1 + ", " + num2 + " ειναι " + result);
        System.out.printf("To αθροισμα των %d και %d ειναι : %d\n", num1, num2, result); // backslash n (\n) αφηνει κενη γραμμη
    }
}
