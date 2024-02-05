package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Import an integer and print out
 * square and cube
 */
public class MathPowersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an int number");
        num = scanner.nextInt();

        System.out.printf("num = %d, num^2 = %d, num^3 = %d",
                num, (int) Math.pow(num, 2), (int) Math.pow(num, 3));
    }
}
