package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IfAbsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, abs = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();

//        if ( num >=  0) {
//            abs = num;
//        } else {
//            abs = -num;
//        }

        //Ternary Operator:
        abs = (num >= 0 ) ? num : - num;
        System.out.println("Abs of: " + num + " is: " + abs);
    }
}
