package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * FileStream with auto-flush.
 * FileOutputStream with true = append
 */
public class PrintStreamAutoFlush {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/f5.txt", true), true, StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
