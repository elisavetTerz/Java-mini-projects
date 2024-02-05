package gr.aueb.cf.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Read two integer from standard input
 * Concatenate the integers and
 * print out the result.
 */
public class AddApp {
    public static void main(String[] args) {
        //Declaration
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 0;

        //Orders
        System.out.println("Please insert two integer numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1 + num2;

        //console.log
        System.out.printf("%,d + %,d = %,d", num1, num2, result);
    }
}
