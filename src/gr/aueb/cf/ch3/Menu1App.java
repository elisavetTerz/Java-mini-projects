package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Menu1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Please choose one of the following:");
            System.out.println("1.  One Player Game");
            System.out.println("2.  Two Player Game");
            System.out.println("3. Exit");
            System.out.println("Give a choice");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 4) {
                System.out.println("Wrong choice");
                continue; //go back to the while
            }

            if (choice == 3) {
                System.out.println("Exit...");
                break;
            }

            if (choice == 1) {
                System.out.println("One Player Game starting...");
            } else {
                System.out.println("Two Player Game starting...");
            }
        }

    }
}
