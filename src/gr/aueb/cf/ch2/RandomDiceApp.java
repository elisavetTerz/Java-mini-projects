package gr.aueb.cf.ch2;

/**
 * dice implementation
 */
public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        System.out.printf("Die1: %d, Die2: %d", die1, die2);
    }
}
