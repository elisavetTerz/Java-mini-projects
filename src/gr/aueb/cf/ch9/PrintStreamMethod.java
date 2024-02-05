package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Print Stream Demo with method.
 */

public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/f1.txt", StandardCharsets.UTF_8);
             PrintStream ps2 = new PrintStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/f2.txt");
             PrintWriter pw = new PrintWriter("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/f3.txt")) {
//            ps.println("Hello Coding Factory");
            printMsg(ps, "Hello Coding Factory Again!!!");
            printMsg(ps2, "Hello Coding Factory Print Stream 2!!!");
            printMsg(System.out, "Hello to Std Output!!!");
            pw.println("Hello from Print Writer");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("File Not Found");
        }

    }

    /**
     *
     * @param ps
     * @param message
     */
    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);

    }
}
