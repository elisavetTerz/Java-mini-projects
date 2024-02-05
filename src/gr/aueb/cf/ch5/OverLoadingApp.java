package gr.aueb.cf.ch5;

/**
 * Java let us do overload:
 * If we have methods with the same name but not signature
 * which are doing the same thing
 */
public class OverLoadingApp {
    public static void main(String[] args) {

    }

    /**
     * Two methods CANNOT have same signature (name + parameters)
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        return a + b;
    }
//    GIVES ERROR:
//    public static int add(int a, int b) {
//        return a + b;
//    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, long b) {
        return a + (int)b;
    }
}
