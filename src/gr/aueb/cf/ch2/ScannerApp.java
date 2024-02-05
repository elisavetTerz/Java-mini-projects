package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scanner Demo. Reads two ints from
 * stdin and prints the sum.
 */
public class ScannerApp {
    public static void main(String[] args) {
        //Value Declaration
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        //order
        System.out.println("Please insert two ints");
        num1 = in.nextInt(); //ignore white spaces, line changes
        num2 = in.nextInt(); //waiting to read a character which is a number

        sum = num1 + num2;

        //Console log
        System.out.printf("Sum of %d and %d is: %d", num1, num2, sum );
    }
}
