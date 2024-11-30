package gr.aueb.cf.ch6;

/**
 * Declaring and Initializing an array.
 * Populate an Array:
 * - new
 * - Unsized Init
 * - array initializer
 * - print items in an array
 *
 */

public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];                         // declare and init
        int[] arr2 = {1, 2, 3, 4, 5};                   // unsized init
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5};         // array initializer

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse
        // θα μπορουσαμε να εχουμε και i <= arr.length - 1
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int el : arr3) {
            System.out.print(el + " ");
        }


    }
}
