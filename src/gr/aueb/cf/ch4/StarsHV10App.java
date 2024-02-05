package gr.aueb.cf.ch4;

import java.util.Arrays;

/**
 * print out 10 rows with 10 stars each
 */
public class StarsHV10App {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
