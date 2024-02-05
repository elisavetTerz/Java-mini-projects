package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");
            System.out.println("Please insert your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("One-player game");
                    break;
                case 2:
                    System.out.println("Two-player game");
                    break;
                case 3:
                    System.out.println("Team game");
                    break;
                case 4:
                    System.out.println("Quit ...");
                    break;
                default:
                    System.out.println("Error ...");
                    break;
            }
        } while (choice != 4);
    }
}
