package gr.aueb.cf.ch9;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies a jpg/png byte-by-byte with FileInputStream read()
 */
public class IOCopy1 {

    public static void main(String[] args) {
        int b;
        int count = 0;
        long start;
        long end;
        long elapsedTime;


        try (FileInputStream in = new FileInputStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/aueb.jpg");
             FileOutputStream out = new FileOutputStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/aueb-out.txjpg")) {
            start = System.nanoTime();
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }

            end = System.nanoTime();
            elapsedTime = end - start;
            System.out.printf("The file with size %d KBytes (%d bytes) is copied", count / 1024, count);
            System.out.printf("Elapsed Time: %.2f", elapsedTime / 1_000_000_000.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
