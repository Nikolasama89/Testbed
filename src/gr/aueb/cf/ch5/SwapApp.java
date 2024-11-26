package gr.aueb.cf.ch5;

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a, b);
        System.out.printf("a = %d, b = %d", a, b);

    }

    /**
     * Mutually exchange values of the
     * two input variables
     *
     * @param a     the first variable
     * @param b     the second variable
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;

    }
}
