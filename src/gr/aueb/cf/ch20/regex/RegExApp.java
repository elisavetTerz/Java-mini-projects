package gr.aueb.cf.ch20.regex;

public class RegExApp {

    public static void main(String[] args) {
        String s = "Green";
        System.out.println(isRed(s));

        String s1 = "c.f@aueb.gr";
        System.out.println(isEmail(s1));

        String aueb = "Athens Uni    of Eco and Bus";
        String[] tokens = aueb.split("\\s+");
        for (String token : tokens) {
            System.out.println(token);
        }

        aueb = aueb.replaceAll("\\s+", "-");
        System.out.println(aueb);

        String bob = "Bob Dylan";


    }

    public static boolean isRed (String s) {
        return s.matches("Red");
    }

    public static boolean isRedOrGreen (String s) {
        return s.matches("Red|Green");
    }

    public static boolean isrRedOrgGreen (String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean startsWithUpperCaseEndsWithIng (String s) {
        return s.matches("[a-zA-Z][iI][gG]");
//        return s.matches("[A-Z]ing");

    }
    public static boolean isAnySymbolFollowedBySpaceAndDigit (String s) {
        return s.matches(".\\s\\d");
    }
    public static boolean isLetterFollowedByDigit (String s) {
        return s.matches("^\\w\\d$");
//        return s.matches("[0-9a-zA-Z_][0-9]");
    }

    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*"); ///!*E*E*W*WC9uudaa
    }

    public static boolean isEmail(String s) {
        return s.matches("^[a-zA-Z.%+-_]+@\\w+\\.[a-zA-Z]{2,}$");
    }

}
