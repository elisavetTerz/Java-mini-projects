package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Adding the digits of two-digit num
 */

public class TwoDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a two digit integer");

        int inputNum = scanner.nextInt();
        //Condition to do the calculation
        if (inputNum >= 10 && inputNum <= 99) {
            int firstDig = inputNum / 10, secondDig = inputNum % 10;
            int sum = firstDig + secondDig;
            int sumOfSquares = (int) Math.pow(firstDig, 2) + (int) Math.pow(secondDig, 2);
            System.out.printf("The sum of the digits of %d is: %d and the sum of squares of every digit is: %d", inputNum, sum, sumOfSquares);
        } else {
            System.out.println("Invalid input: type two-digit number please!");
        }
    }
}
