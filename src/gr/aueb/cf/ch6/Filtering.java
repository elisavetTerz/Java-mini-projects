package gr.aueb.cf.ch6;

/**
 * Filtering Demo
 * We have an array with grades and want to
 * return a new array with the grades are passed
 */
public class Filtering {

    public static void main(String[] args) {
        int[] grades = {4, 2, 6, 9, 10, 2, 1, 1, 3, 5};
        final int PASS_LIMIT = 5;

        int[] passed = getPassGrades(grades, PASS_LIMIT);
        for (int grade : passed) {
            System.out.print(grade + " ");
        }

    }

    /**
     *Return a new array with grades >= limit
     * @param grades from the src array
     * @param limit the threshold to which we compare the grades
     * @return a new array with passed-grades
     */

    public static int[] getPassGrades(int[] grades, int limit) {
        //we do NOT know the index of the new array
        // we need a count to calculate the length of the new array
        int count = 0;
        /*
        It is NOT very correct to return null
        It would be better to return something else:
        if (grades == null) return new int[0];
         */
        if (grades == null) return null;
        for (int grade : grades) {
            if (grade >= limit) {
                count++;
            }
        }

        int[] passOut = new int[count];
        int pivot = -1;
        for (int grade : grades) {
            if (grade >= limit) {
                //pivot++ would have if we start from pivot = 0;
                //++pivot we want first to increase the pivot from -1 to 0;
                passOut[++pivot] = grade;
            }

        }
        return passOut;

    }
}
