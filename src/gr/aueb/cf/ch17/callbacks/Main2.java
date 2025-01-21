package gr.aueb.cf.ch17.callbacks;

public class Main2 {

    public static void main(String[] args) {

        // lambda implementation - callback / Υλοποίηση της doPrint
        doPrint( () -> System.out.println("Hello World"));

        doPrint( () -> System.out.println("Hello Coding Factory"));

    }

    public static void doPrint(Printable printable) {
        printable.print();
    }
}
