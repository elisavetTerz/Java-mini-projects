package gr.aueb.cf.ch6;

/**
 * Predicates = Boolean functions.
 */
public class Predicates {

    public static void main(String[] args) {
        int[] myArray = {2, 4, 7, 8, 10};
        System.out.println("All items in the array are evens: " + allAreEvens(myArray));
    }

    public static boolean allAreEvens(int[] arr) {
        if (arr == null) return false;
        boolean isEven = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }
        return isEven;

        //other solution:
//        int evens = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                evens++;
//            }
//        }
//        return evens == arr.length;
    }

    public static boolean anyIsEven(int[] arr) {
        if (arr == null) return false;
        boolean isEven = false;
        for (int num : arr) {
            if (num % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }
}
