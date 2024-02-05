package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demo of Buffer reader in combination with StringBuilder
 */

public class BufferedReaderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/bf-reader.txt"))) {
            String line = "";
            while  ((line = bf.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
