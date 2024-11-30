package gr.aueb.cf.ch6;

/**
 * Finds Min and Max of an array
 */

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 78, -59, 43};
        int min = getMinPosition(arr);
        int max = getMaxPosition(arr);
        System.out.printf("Min Value Index: %d, Max Value Index: %d", min, max);

    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}