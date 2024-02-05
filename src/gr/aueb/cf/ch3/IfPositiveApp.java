package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * control if a number >=0
 */
public class IfPositiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number");
        num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
