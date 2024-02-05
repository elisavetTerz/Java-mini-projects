package gr.aueb.cf.ch5;

/**
 * swap: an act of exchanging one thing for another.
 * if int a = 5, b = 10; => a = 10, b = 5; (SWAP)
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.printf("a = %d, b = %d", a, b);
    }

    /**
     * Swaps two values.
     * @param a the first value.
     * @param b the second value.
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
