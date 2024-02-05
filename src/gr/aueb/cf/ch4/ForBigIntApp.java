package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class ForBigIntApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, n = 0;
        //Auto boxing the int to BigInteger: typecast
        BigInteger result = BigInteger.ONE; //ONE = 1

        System.out.println(result);
        System.out.println("Please insert base and power");
        a = scanner.nextInt();
        n = scanner.nextInt();

        for (int i = 1; i<= n; i++) {
            result = result.multiply(BigInteger.valueOf(a));
            //result = result * a CANNOT DO IT because a is integer and result is BigInteger
        }
        System.out.println("Result: " + result);

    }
}
