package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the power n of a number a (a^n)
 * 2^10=1024, 3^3=27
 *
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baseValue = 0, powerValue = 0, result = 1;
        int i = 1;

        System.out.println("Please insert the number and the power of number (int):");
        baseValue = scanner.nextInt();
        powerValue = scanner.nextInt();

        while (i <= powerValue) {
            result *= baseValue;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
