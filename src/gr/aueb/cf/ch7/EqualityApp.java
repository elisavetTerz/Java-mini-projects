package gr.aueb.cf.ch7;

/**
 * Demonstrates equality between Strings.
 */
public class EqualityApp {

    public static void main(String[] args) {
        String s1 = "AUEB";
        String s2 = "AUEB";
        String s3 = "aueb";
        //We do not compare the context but the references
        //if (s1 == s2) {System.out.println("Equal"); }
        // We do NOT use logical operators to compare strings but the method equal.

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        //equal is Case sensitive. To ignore upper or lower case we use the equalsIgnoreCase.
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("EQUAL");
        }

        //STRING COMPARISON the compareTo returns > OR = OR < 0.
        if (s1.compareTo(s3) > 0) {
            System.out.println("s1 bigger than s3");
        }
        if (s1.compareToIgnoreCase(s3) > 0) {
            System.out.println("s1 bigger than s3");
        }
        //NORMALIZATION
        s3 = s3.toUpperCase();
        s2 = s2.toUpperCase();
        String s4 = s2.toLowerCase();

        //PRIMITIVE TO STRING with String.valueOf - TYPECAST
        String s5 = String.valueOf('a');
    }
}
