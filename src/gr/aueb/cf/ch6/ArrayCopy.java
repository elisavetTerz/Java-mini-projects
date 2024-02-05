package gr.aueb.cf.ch6;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2};
//        int[] clone = shallowCopy(arr);
        int[] clone = deepCopy(arr);
        clone[0] = 500;

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * shallowCopy helps us not to change the arr
     * creates a copy not a reference
     * @param arr
     * @return
     */
    public static int[] shallowCopy(int[] arr) {
        return arr;
    }

    public static int[] deepCopy(int[] arr) {
        int[] arrayToReturn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i];
        }
        return arrayToReturn;
    }
}
