package gr.aueb.cf.ch5;

public class PowerRecursive {
    public static void main(String[] args) {

    }
    public static int power(int a, int n) {
         //2^10 => 2*2^(10-1)
        return (n == 0) ? 1 : a * power (a, n-1);

    }
}
