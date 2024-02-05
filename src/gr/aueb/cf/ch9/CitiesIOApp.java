package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file cities.txt with every line includes:
 * country, city1, city2 etc.
 * And returns a file for every line of the original file.
 */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line = "";
        String[] cities;
        File dir = new File("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/file-io.txt");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make directory");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/cities.txt"))){
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +"); //delimiter: one or more spaces
                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + "gr.txt");
                        PrintStream psGR = new PrintStream(grFile, StandardCharsets.UTF_8);
                        printTitle(psGR, "GR Cities");
                        printTokens(psGR, cities);
                        break;
                    case "USA":
                        File usaFile = new File(dir + "/" + "gr.txt");
                        PrintStream psUSA = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        printTitle(psUSA, "USA Cities");
                        printTokens(psUSA, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + "gr.txt");
                        PrintStream psDE = new PrintStream(deFile, StandardCharsets.UTF_8);
                        printTitle(psDE, "Germany Cities");
                        printTokens(psDE, cities);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printTokens(PrintStream ps, String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }

    public static void printTitle(PrintStream ps, String title) {
        ps.println(title);
    }

}
