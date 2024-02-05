package gr.aueb.cf.ch5;

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;
        /* Full name of method add is AddApp.add because it belongs to class static AddApp */
        result = AddApp.add(a, b);
        System.out.printf("%d + %d = %d", a, b, result);

    }

    /**
     * Create a method add which returns the sum of two integers
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of a, b
     */
// Static methods can call only static methods!!!
    public static int add(int a, int b) {
        return a + b;
//        int sum = 0;
//        sum = a + b;
//        return sum;
    }
}
