package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy2 {

    public static void main(String[] args) {
        int b;
        int count = 0;
        long start;
        long end;
        double elapsedTime;
        byte[] buf = new byte[8192];

        start = System.nanoTime();
        try (FileInputStream in = new FileInputStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/v1.mp4");
             FileOutputStream out = new FileOutputStream("/Users/elisavet/Desktop/Coding Factory/Exercises/JAVA Exercises/files/v1-out.mp4")) {
            start = System.nanoTime();
            while ((b = in.read(buf)) != -1) {
                out.write(buf, 0, b);
                count += b;
            }

            end = System.nanoTime();
            elapsedTime = (end - start) / 1_000_000_000.0;
            System.out.printf("The file with size %d KBytes (%d bytes) is copied\n", count / 1024, count);
            System.out.printf("Elapsed Time: %.2f", elapsedTime);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
