package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BooleanApp {
    public static void main(String[] args) {
        boolean isWoman = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a woman (true / false)?");
        isWoman = scanner.nextBoolean();

        System.out.printf("You are Woman: %b", isWoman);
    }
}
