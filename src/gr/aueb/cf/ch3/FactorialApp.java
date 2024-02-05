package gr.aueb.cf.ch3;
/**
 * Calculates the n! = 1*2*3*...*n
 * 4! = 1*2*3*4 = 24
 */

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, facto = 1, i = 1;

        System.out.println("Please insert a number:");
        n = scanner.nextInt();

        while ( i<= n) {
            facto *= i;
            i++;
        }
    }
}
