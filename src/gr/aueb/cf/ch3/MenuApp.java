package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Outputs the menu as soon as
 * the user chooses exit
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following:");
            System.out.println("1. Add New Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        } while (choice != 3);

    }
}
