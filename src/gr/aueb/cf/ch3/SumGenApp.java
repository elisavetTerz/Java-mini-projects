package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * calculates the sum of 1+2+...+n
 * where n is input from the user (stdin
 */
public class SumGenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0, i = 1, result = 0;
        System.out.println("Please insert a number (int):");
        endValue = scanner.nextInt();

        while (i <= endValue) {
            result += i;
            i++;
        }
        System.out.printf("Sum 1+2+...+%d = %d", endValue, result);
    }
}
