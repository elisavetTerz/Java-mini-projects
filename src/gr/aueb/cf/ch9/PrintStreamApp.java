package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Print Stream Demo: we can print out in a file
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/f1.txt")){
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}

