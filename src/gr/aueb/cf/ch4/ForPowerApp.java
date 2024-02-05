package gr.aueb.cf.ch4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ForPowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0, power = 0, result = 1;

        System.out.println("Please insert base and power:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i<= power; i++) {
            result *= base;
        }
        System.out.printf("%d^%d = %,d", base, power, result);
    }
}
