package gr.aueb.cf.ch5;

public class CompareWithEpsilon {
    public static void main(String[] args) {
        final double EPSILON = 0.00001;
        double actual = 0.0, expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }
        System.out.printf("Actual: %.20f -- Expected: %.20f\n", actual, expected);

        if (actual == expected) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
