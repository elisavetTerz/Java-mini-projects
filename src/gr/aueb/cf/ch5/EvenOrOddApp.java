package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOrOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please insert a number:");
        num = scanner.nextInt();
        boolean theNumberIsEven = isEven(num);
        System.out.printf("The number is even: %b", theNumberIsEven);
    }

    /**
     *
     * @param num the input number.
     * @return true, if is even, otherwise false.
     */
    public static boolean isEven(int num) {
        //instead of if num % 2 == 0 return true else false, we can write:
        return (num % 2) == 0;

    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
