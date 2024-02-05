package gr.aueb.cf.ch3;
import java.util.Scanner;
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false, isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false, LightsOn = false;
        System.out.println("Please insert if it is raining (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Please insert if it is dark (true/false)");
        isDark = scanner.nextBoolean();
        System.out.println("Please insert car speed (int)");
        speed = scanner.nextInt();

        isRunning = speed > MAX_SPEED;
        LightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights om: " + LightsOn);
    }
}
