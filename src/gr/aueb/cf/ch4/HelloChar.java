package gr.aueb.cf.ch4;

public class HelloChar {

    public static void main(String[] args) {
        char star = '*';
        char alpha = 'a';
        char upperAlpha = 'A';
        char dot = '.';
        char bang = '!';
        final char EMPTY_SPACE = ' ';
        int hash = '#';

        System.out.println(star);
        System.out.println(alpha);
        System.out.println(dot);

        System.out.println("Hash: " + (char) hash); //TYPECAST

        if (alpha > upperAlpha) {
            System.out.println("a is greater (ordinal) than A");

        } else {
            System.out.println("A is greater than a");
        }
    }
}
