package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {
        String aueb = "Athens::::::      Uni:Of:Econ and Bus";

        String[] tokens = aueb.split(":");
        String[] tokens1 = aueb.split(" +"); //if there are one or more spaces as delimiters

        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
        for (String token : tokens1) {
//            System.out.println(token + " ");
            System.out.print(token + " ");
        }
    }
}
