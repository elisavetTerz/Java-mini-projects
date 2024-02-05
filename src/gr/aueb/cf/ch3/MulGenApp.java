package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MulGenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int endValue = 0, i = 1, result = 1;
        System.out.println("Please insert a number (int): ");
        endValue = scanner.nextInt();
        while (i <= endValue) {
            result *= i;
            i++;
        }
        System.out.printf("Result is: %,d", result);
    }
}
