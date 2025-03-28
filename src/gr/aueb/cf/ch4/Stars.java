package gr.aueb.cf.ch4;


public class Stars {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("*");
        }

        for (int i = 1; i < 10; i++) {
            System.out.print("*");
        }

        //Nested ForLoop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Ascending Stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Descending
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Descending second way
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
