package gr.aueb.cf.ch5;

public class FloatingPointApp {
    public static void main(String[] args) {
        float floatNum = 4.5f;
        double doubleNum = 20d;
        int num = 23;
        double result = 0.0;
//Typecast:auto widening if there is float everything becomes float but if there is double everything becomes double

        result = floatNum + doubleNum + num;
        System.out.printf("%.6f + %.2f + %d = %.2f", floatNum, doubleNum, num, result);
//Exponential format: %.2e
//Causes Formatter to use either %f or %e, whichever is shorter: %.2g

    }
}
