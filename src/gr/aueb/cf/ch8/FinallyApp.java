package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Finally is always executed
 * When we want to close resources
 * Whatever is being opened should be closed
 */

public class FinallyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        try {
            System.out.println("Please insert an int");
            num = in.nextInt();

            System.out.println(num);
            //in.close(); //closes the threads
        } catch (InputMismatchException e) {
            e.printStackTrace();
            //return;
        } finally {
            try {
                if (in != null) in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("It's not always executed");
    }
}
