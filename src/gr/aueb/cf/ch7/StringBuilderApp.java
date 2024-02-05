package gr.aueb.cf.ch7;

/**
 * COMPARISON: String vs StringBuilder
 */
public class StringBuilderApp {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        //There are two System methods to take time
        timeStart = System.currentTimeMillis(); //From 1/1/70 the milliseconds
        for (int i = 1; i <= 100_000; i++) {
            //30000 times we concat i with s and a new space string is created bc strings are immutable
            s += i; //everything is becoming string when we have concat with strings
        }
        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0; //instead of typecast to double we divide with a double


        timeStart = System.currentTimeMillis(); //From 1/1/70 the milliseconds
        for (int i = 1; i <= 100_000; i++) {
            //30000 times we concat i with s
            sb.append(i); //adding the i in the same space-string builder is mutable(can change)
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0; //instead of typecast to double we divide with a double

        System.out.println("String elapsed time: " + stringElapsedTime + " seconds");
        System.out.println("String Builder elapsed time: " + sbElapsedTime + " seconds");
    }
}
