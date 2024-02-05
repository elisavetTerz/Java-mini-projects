package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0, denominator = 0, result; //arithmitis - paranomastis

        while (true) {
            System.out.println("Please insert the numerator");
            numerator = scanner.nextInt();
            System.out.println("Please insert the denominator");
            denominator = scanner.nextInt();
            //Linearize the code
            if (denominator == 0) {
                System.out.println("Error: Denominator cannot be zero");
                break;
            }
            if (numerator == 0) {
                System.out.println("Error: Numerator cannot be zero");
                break;
            } //bc we use break we do not need the else


//            if (numerator != 0) {
//                if (denominator != 0) {
//                    result = numerator / denominator;
//                } else {
//                    System.out.println("Denominator cannot be zero ");
//                    break; //stop while and leave the iteration
//                }
//            } else {
//                System.out.println("Numerator cannot be zero ");
//                break;
//            } //No so good syntax of code
            result = numerator / denominator;
            System.out.println("Result is: " + result);
        }
    }
}
