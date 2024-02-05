package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CombinationsApp {

    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/CodingFactoryTestbed/inputData.txt");
        File outFile = new File("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/CodingFactoryTestbed/outputData.txt");
        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(outFile);
        int m = 4;
        int [] row = new int[m];
        ArrayList<Integer> numbers = new ArrayList<>();

        //Populate the Array List
        //reading the numbers of input file
        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }
        int k = numbers.size();

        for (int i  = 0; i <= k -m; i++) {
            for (int j = i + 1; j <= k - m + 1; j++) {
                for (int l = j + 1; l <= k - m + 2; l++) {
                    for (int n = l + 1; n <= k - m + 3; n++ ) {
                        //get takes the indexes of the table
                        row[0] = numbers.get(i);
                        row[1] = numbers.get(j);
                        row[2] = numbers.get(l);
                        row[3] = numbers.get(n);

                        if (!isEven(row, 2)) {
                            System.out.printf("%d\t%d\t%d\t%d\n", row[0], row[1], row[2], row[3]);
                            ps.printf("%d\t%d\t%d\t%d", row[0], row[1], row[2], row[3]);
                        }
                    }
                }
            }
        }
    }
//threshold = the level or point at which something starts
    public static  boolean isEven(int[] row, int threshold) {
        int evens = 0;

        for (int num : row) {
            if (num % 2 == 0) evens++;
        }
        return evens > threshold;
    }
}
