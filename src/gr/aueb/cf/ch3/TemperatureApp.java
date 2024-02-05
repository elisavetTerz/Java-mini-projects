package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * If temp<0 then isTempBelowZero is true
 * else false
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = true;
        System.out.println("Please insert temperature");
        temp = scanner.nextInt();

        isTempBelowZero = ( temp < 0);
        System.out.println("Temperature is below zero: " + isTempBelowZero);

    }
}
