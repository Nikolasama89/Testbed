package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 5};
        int[] doubles = getDoubles(arr);
        for (int el: doubles){
            System.out.println(el + " ");
        }
        System.out.println();
        System.out.println(sum(arr));
        System.out.println(average(arr));
        System.out.println("Any Even: " + anyEven(arr));
        System.out.println(moreThanTwoEvens(arr));

    }

    //FILTERING
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

    // MAPPING
    public static int[] getDoubles(int[] arr) {
        int[] mapped = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
        int sumValue = 0;

        for (int i = 0; i < arr.length; i++) {
            sumValue += arr[i];
        }
        return sumValue;
    }

    public static double average(int[] arr) {
//        double average = 0;
//        int sumValue = 0;
//        for(int el : arr) {
//            sumValue += el;
//            average = (double) sumValue / arr.length;
//
//        }
//        return average;
        return (double)sum(arr) / arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;
        for (int el : arr) {
            if(el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for(int el : arr) {
            if (el % 2 == 0) count++;

        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] -2) {
                count++;
                break;

            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {

        int[] endings = new int[10];
        boolean isSameEnding = false;
        for (int num : arr) {
            endings[num % 10] ++;
        }
        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean AllAreEven(int[] arr) {
//        return getEvens(arr).length == arr.length;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count ++;
        }
        return count == arr.length;


    }
}
