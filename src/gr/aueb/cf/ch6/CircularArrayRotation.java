package gr.aueb.cf.ch6;

public class CircularArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Initial Array");
        print(arr);
        System.out.println();

        int[] leftRotatedArray = shiftLeftBy(arr, 1);
        System.out.println("Left rotated by one");
        print(leftRotatedArray);
        System.out.println();

        int[] rightRotatedArray = shiftRightBy(arr, 3);
        System.out.println("Right rotated by three");
        print(rightRotatedArray);
        System.out.println();
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }
        return rotated;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
