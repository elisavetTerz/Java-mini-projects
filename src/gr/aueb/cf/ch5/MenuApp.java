package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            printMenu();
            choice = in.nextInt();
            switch  (choice) {
                case 1:
                    System.out.println("Successful Creation");
                    break;
                case 2:
                    System.out.println("Successful Update");
                    break;
                case 3:
                    System.out.println("Successful Delete");
                    break;
                case 4:
                    System.out.println("Searching...");
                    break;
                case 5:
                    System.out.println("Exit Completed");
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        } while (choice != 5);
    }

    /**
     * Create a method to print out a menu
     * CRUD
     */
    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Create");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. Exit");
    }
}
