package gr.aueb.cf.ch6;

public class ArrayAddOneApp {

    public static void main(String[] args) {
        int[] arr = {8, 8 ,8 ,8};
        int[] arr1 = {8, 8 ,8 ,8};

        int[] result = addOne(arr);
        int[] result1 = addTwoInts(arr, arr1);

        for (int num : result) {
            System.out.print(num);
        }
        System.out.println();
        for (int num : result1) {
            System.out.print(num);
        }
    }

    public static int[] addOne(int[] arr) {
        if (arr == null) return null; //throw new IllegalArgumentException();
        int carry = 1; //carry = 1 bc in the beginning we add 1.
        int sum;
        int[] arrOut = new int[arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum /10;
        }

        arrOut[0] = (carry == 1) ? 1 : 0;
        return arrOut;
    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) return null;
        if (arr1.length != arr2.length) return null;

        int carry = 0;
        int sum;
        int[] arrOut = new int[arr1.length + 1];
//from the end to the start
        for (int i = arr1.length - 1; i >= 0; i--) {
            sum = arr1[i] + arr2 [i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum /10;
        }

        arrOut[0] = (carry == 1) ? 1 : 0;
        return arrOut;
    }
}
