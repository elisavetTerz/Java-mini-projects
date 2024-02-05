package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.util.Locale;

/**
 * Input 3 integers: hours, minutes and seconds from Standard Input
 * converts to seconds and print out the total seconds
 */

public class DateToSecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0, inputMinutes = 0, inputSeconds = 0;
        int totalSeconds = 0;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_MIN = 60;

        System.out.println("Please insert hours, minutes, seconds (ints)");
        inputHours = scanner.nextInt();
        inputMinutes = scanner.nextInt();
        inputSeconds = scanner.nextInt();

        totalSeconds = (inputHours * SECS_PER_HOUR) + (inputMinutes * SECS_PER_MIN) + inputSeconds;
        System.out.printf(Locale.forLanguageTag("el-GR") , "%02d hours, %02d minutes, %02d seconds = %,d total seconds",
                inputHours, inputMinutes, inputSeconds, totalSeconds);
    }
}
