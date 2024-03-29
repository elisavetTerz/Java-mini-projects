package gr.aueb.cf.ch3;

/**
 * Special examples of while
 * 0 times, 1 time, infinite
 */

public class SpecialWhileApp {

    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println("NEVER gets in");
            i++;
        }
        while (i <= 1) {
            System.out.println("Only ONE iteration");
            i++;
        }
        while (true) {
            System.out.println("Eternal while loop");
        }
    }
}
