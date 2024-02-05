package gr.aueb.cf.ch3;

/**
 * Calculates the 1*2*...*10
 */
public class Mul10App {
    public static void main(String[] args) {
        int i = 1, result = 1;
        while (i <= 10) {
            result *= i;
            i++;
        }
        System.out.printf("Result is : %,d", result);
    }
}
