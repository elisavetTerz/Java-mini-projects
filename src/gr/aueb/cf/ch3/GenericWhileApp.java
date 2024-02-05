package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Inputs: start value, end value and step
 * Calculates the number of iterations (number of loops)
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        int startValue = 0, endValue = 0, step = 0;
        int iterations = 0, j = 1;
        Scanner scanner = new Scanner(System.in);

        while (j <= 3) {
            System.out.println("Please insert startValue, endValue and step:");
            startValue = scanner.nextInt();
            endValue = scanner.nextInt();
            step = scanner.nextInt();
            iterations = 0;

            while (startValue <= endValue) {
                iterations++;
                startValue += step;
            }
            System.out.println("Iterations: " + iterations);
            j++;
        }
        System.out.println("Thanks for using the app!");
    }
}
