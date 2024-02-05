package gr.aueb.cf.ch7;

/**
 * Searches for chars or substrings.
 */
public class StringSearchApp {

    public static void main(String[] args) {
        String s = "Athens Uni of Eco and Bus";

        if (s.contains("Uni")) {
            System.out.println("Bingo");
        }
//        int index = s.indexOf("Uni");
//        int index = s.indexOf("*");

//        chars are small ints
//        int ch = 'a';
//        int index = s.indexOf(ch);
//        System.out.println(index);

        if (s.startsWith("Athens")) {
            System.out.println("Starts with Athens");
        }

        String athens = s.substring(6);
        System.out.println(athens);
    }
}
