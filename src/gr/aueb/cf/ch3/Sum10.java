package gr.aueb.cf.ch3;

/** calculates 1+2+3+...+10
 * with while...do
 */

public class Sum10 {

    public static void main(String[] args) {
        int i = 1, result = 0;
        while ( i <= 10) {
            result += i;
            i++;
        }
        System.out.println("Sum is: " + result);
    }
}
