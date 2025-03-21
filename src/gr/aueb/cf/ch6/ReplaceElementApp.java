package gr.aueb.cf.ch6;

/**
 * Replace the item of an array
 * with another value.
 */

public class ReplaceElementApp {

    public static void main(String[] args) {

    }

    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newVal;
    }

    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
