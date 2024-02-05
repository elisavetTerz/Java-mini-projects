package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * user inputs two integer numbers
 * and the program calculates which is the min number
 */

public class MinValueApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        int min = 0;

        System.out.println("Please insert two numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2) {
//            min = num1;
//        } else {
//            min = num2;
//        }
        min = num1 < num2 ? num1 : num2;
        System.out.printf("Num1: %d, Num2: %d, Min: %d", num1, num2, min);
    }
}
