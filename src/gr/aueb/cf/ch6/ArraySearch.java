package gr.aueb.cf.ch6;

public class ArraySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        final int SECRET = 4;
        boolean found = false;

        //ONE WAY TO LOOP
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == SECRET) {
//                found = true;
//                break;
//            }
//        }

        // SECOND WAY
        for (int el : arr) {
            if (el == SECRET){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + SECRET + " was in the array!");
        } else {
            System.out.println("SECRET not found");
        }
    }
}
