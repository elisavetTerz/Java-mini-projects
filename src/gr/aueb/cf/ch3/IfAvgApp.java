package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IfAvgApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade1 = 0, grade2 = 0, total = 0;
        int avg = 0;

        System.out.println("Please insert grade1, grade2, total");
        grade1 = scanner.nextInt();
        grade2 = scanner.nextInt();
        total = scanner.nextInt(); //amount of grades

        if (total != 0) {
            avg = (grade1 + grade2) / total;
            if (avg >= 8) {
                System.out.println("Excellent");
            } else if (avg >= 6) {
                System.out.println("Very Good");
            } else if (avg >= 4) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("Error: divide by zero!");
        }
    }
}
