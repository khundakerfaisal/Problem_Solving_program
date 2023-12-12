package Assignment;

import java.util.Arrays;

public class medianOfCgpaAssignment_5 {
    public static void main(String[] args) {
        double[] cgpaArray = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpaArray);
        double median=0;
        int count=0;
        for (int i = 0; i < cgpaArray.length; i++) {
            count = cgpaArray.length;
            median = (cgpaArray[(count / 2)]);
        }
        System.out.println("Median CGPA: " +median);

    }
}
