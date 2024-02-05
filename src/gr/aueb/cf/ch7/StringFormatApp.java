package gr.aueb.cf.ch7;

/**
 * Demo of String format
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'G';
        int column = 7;
//formatting primitive of values is NOT concat
        String seat = String.format("%c%02d", row, column);
        System.out.println(seat);
    }
}
