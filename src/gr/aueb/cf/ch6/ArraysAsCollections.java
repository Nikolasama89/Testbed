package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    //FINDING EVENS IN AN ARRAY
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for(int el : arr) {
            if (el % 2 ==0) {
                evens[pivot] = el;  //evens[pivot++] = el;
                pivot++;
            }
        }
        return evens;
    }
}
