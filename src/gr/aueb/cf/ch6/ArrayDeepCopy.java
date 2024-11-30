package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {

    }

    /**
     * It does a fresh copy(deep copy) of an array
     *
     * @param source    the source array
     * @return          the copied arrays
     */

    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

        // THE OLD CLASSIC WAY
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        //second way
//        System.arraycopy(source, 0, destination, 0, source.length);
        // third way
//        destination = Arrays.copyOf(source, source.length);
//        destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
