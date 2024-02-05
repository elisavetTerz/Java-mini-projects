package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Standard input an integer num = scottish pounds
 * convert the Pound sterling to USD ($1 = 100cents)
 * print out the result: 10 pounds = xx USD dollars and yy cents.
 */
public class BankOfScotlandApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scottishPounds = 0;
        int usdDollars = 0;
        int usdCents = 0;
        int totalUsdCents = 0;
        //the exchange rate between the currencies of two countries
        final int PARITY = 137;

        System.out.println("Please insert the amount of Scottish Pounds");
        scottishPounds = scanner.nextInt();
        totalUsdCents = scottishPounds *  PARITY; //temp variable (helps us)
        usdDollars = totalUsdCents / 100;
        usdCents = totalUsdCents % 100;
//insert unicode symbol for pounds, dollars : U+00A3 £ POUND U+0024 sign "$"
        System.out.printf("\u00A3%d (Scottish Pounds) = \u0024%d (USD Dollars) and %d USD Cents",
                scottishPounds, usdDollars, usdCents);
    }
}
