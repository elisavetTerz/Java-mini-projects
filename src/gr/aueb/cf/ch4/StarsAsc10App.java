package gr.aueb.cf.ch4;

/**
 * ascending: print out 1 star in the first row, 2 in the second,
 */
public class StarsAsc10App {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
