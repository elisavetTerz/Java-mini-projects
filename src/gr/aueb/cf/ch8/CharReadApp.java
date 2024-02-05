package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.Arrays;

public class CharReadApp {

    public static void main(String[] args) {
        String s;
        try {
            s = getString(); //Unhandled exception, we should do try-catch
            System.out.println(s);
        } catch (IOException e) {
            // Customize message: System.out.println("Error in read");
            System.out.println(e.getMessage());
        }
    }

    public static String getString() throws IOException {
        char[] tokens = new char[2];
        try {
            System.out.println("Please Insert Two Chars");
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();
            }
        } catch (IOException e) {
            //recover
            e.printStackTrace(); //log to console if we are in the development phase
            throw e; //rethrow
        }
        return Arrays.toString(tokens);
    }
}
