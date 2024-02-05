package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * inputs: temperature and if it is raining
 * and print out if it is snowing
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean x = false , isSnowing;

        System.out.println("Please insert temperature:");
        temp = scanner.nextInt();
        System.out.println("Please type: true if it is raining else type: false");
        x = scanner.nextBoolean();

        isSnowing = x && temp < 0; //short-circuit
        System.out.println("Is snowing: " + isSnowing);
    }
}
