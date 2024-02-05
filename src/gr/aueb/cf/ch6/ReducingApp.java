package gr.aueb.cf.ch6;

public class ReducingApp {

    public static void main(String[] args) {

    }

    /**
     * Returns the sum od all the elements of the array
     * @param arr the source array.
     * @return the total sum of the items of the array.
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
        return total;
    }

    /**
     * Returns the average of the elements of the array.
     * @param arr the src array.
     * @return the average.
     */
    public static double getAverage(int[] arr) {
        if (arr == null) return 0.0;
        if (arr.length == 0) return 0.0;

//        double average = 0;
//        average =  (double) getTotal(arr) / arr.length;
//        return average;
        //the average is double
        // we need to typecast one of the following int to double:
        return (double) getTotal(arr) / arr.length;
    }

//    public static double getAvg(int[] arr) {
//        if (arr == null) return 0;
//        double avg = 0;
//        int total = 0;
//        for (int item : arr) {
//            total += item;
//        }
//        avg = (double) total / arr.length;
//        return avg;
//    }
}
