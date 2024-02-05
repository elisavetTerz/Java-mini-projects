package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Simple pocket computer with methods
 */
public class CalculatorApp {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, result = 0;
        int choice = 0;
        do {
        //print menu
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Wrong Choice");
                continue;
            }
            if (choice != 6) {
                System.out.println("Please insert two integers:");
                num1 = getOneNumber();
                num2 = getOneNumber();
                result = getResult(choice, num1, num2);
                System.out.println("Result: " + result);
            }
        } while (choice != 6);
    }
    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Add");
        System.out.println("2. Substitute");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Exit");

    }
    public static int getUserChoice() {
        return  in.nextInt();
    }
    public static int getOneNumber() {
        return in.nextInt();
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        if ( b == 0 ) {
            System.out.println("Invalid number: 0");
            return 0;
        }
        return a / b;
    }
    public static int mod(int a, int b) {
        if ( b == 0 ) {
            System.out.println("Invalid number: 0");
            return 0;
        }
        return a % b;
    }

    public static int getResult(int choice, int num1, int num2) {
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        } return result;
    }
}
