package gr.aueb.cf.ch2;
//import of java packages
import java.math.BigInteger;

public class AddBigIntsApp {
    public static void main(String[] args) {
        //java.math.BigInteger bigNum1 = new java.math.BigInteger("213457586789");

        BigInteger bigNum1 = new BigInteger("2134575867895555555555555555555555555");
        BigInteger bigNum2 = new BigInteger("123457599989");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d\n" , result);
    }
}
