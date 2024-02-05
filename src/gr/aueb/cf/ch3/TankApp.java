package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * input true or false from stdin for two tanks of an airplane
 * and if one of the tanks is <1/4 , lights on the orange button
 * if both of them are <1/4, lights on the red button
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEmptyTank1 = false, isEmptyTank2;
        boolean isOrange = false, isRed = false;

        System.out.println("Please insert tank1 status (true/false)");
        isEmptyTank1 = scanner.nextBoolean();
        System.out.println("Please insert tank2 status (true/false)");
        isEmptyTank2 = scanner.nextBoolean();

        //eXclusiveOR ^ is the right logic operation
        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;
        System.out.println("Orange: " + isOrange + ", Red: " + isRed);
    }
}
