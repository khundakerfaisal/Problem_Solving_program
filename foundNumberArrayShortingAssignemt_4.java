package Assignment;

import java.util.Arrays;

public class foundNumberArrayShortingAssignemt_4 {
    public static void main(String[] args) {
        boolean checkGrade = findCGPA(3.86);
        System.out.println("Is your input grade found : \n" +checkGrade);




    }

    public static boolean findCGPA(double grade) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        boolean isfound=false;
        Arrays.sort(cgpa);

        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] == grade) {
                isfound = true;
                break;
            }

        }

        return isfound;
    }
}
