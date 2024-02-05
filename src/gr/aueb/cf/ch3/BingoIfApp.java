package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * user gives values until he finds the secret
 */

public class BingoIfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        final int SECRET = 12;
        boolean isBingo = false;

        do {
            System.out.println("Please insert a number:");
            inputNum = scanner.nextInt();

            if (inputNum == SECRET) {
                System.out.println("Bingo!");
                isBingo = true;
            } else {
                System.out.println("Not found");
            }
        } while (!isBingo);
    }
}
