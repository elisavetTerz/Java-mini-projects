package gr.aueb.cf.ch3;
/**
 * Input positive values and count while the
 * user inputs a negative value
 */

import java.util.Scanner;

public class PositiveCountApp {

    public static void main(String[] args) {
        int inputNum = 0, positives = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number (negative for QUIT):");
        inputNum = scanner.nextInt();

        while (inputNum >= 0) {
            positives++;
            System.out.println("Please insert a number (negative for QUIT):");
            inputNum = scanner.nextInt();
        }
        System.out.println("Positive Count: " + positives);
    }
}
