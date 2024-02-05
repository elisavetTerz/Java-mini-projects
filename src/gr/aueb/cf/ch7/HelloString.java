package gr.aueb.cf.ch7;

public class HelloString {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = "Bob";

        System.out.println("Hello " + alice + " and " + bob + "!");
        System.out.printf("Hello %s and %s!\n", alice, bob);
        System.out.println("Total length of alice string is: " + alice.length());
        System.out.println("Total length of bob string is: " + bob.length());
    }
}
