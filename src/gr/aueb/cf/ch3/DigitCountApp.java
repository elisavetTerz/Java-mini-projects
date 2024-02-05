package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * counts the amount of digits of an int number
 * that inputs the user
 */

public class DigitCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0, num = 0, count = 0;

        System.out.println("Please insert a number (int):");
        inputNum = scanner.nextInt();

        num = inputNum;
        do {
            count++;
            num /= 10;
        }  while (num != 0);
        System.out.println("Digit Count: " + count);


    }
}
