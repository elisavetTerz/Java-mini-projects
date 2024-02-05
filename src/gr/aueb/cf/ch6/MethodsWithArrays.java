package gr.aueb.cf.ch6;

public class MethodsWithArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        //check if arr has values
        if (arr == null) return; //void
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * Overloaded printArray
     * Prints the elements of an array
     * in a region defined from 'low' index to 'high' index.
     * @param arr the source array.
     * @param low the "from" index.
     * @param high the "to" index.
     */
    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
