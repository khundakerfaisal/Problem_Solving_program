package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class foundNumberArrayShortingAssignemt_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input CGPA");
        double newinput = scanner.nextDouble();
        boolean checkCgpa = findCGPA(newinput);
        System.out.println("Is my input " +newinput +" CGPA is present in the list : \n" +checkCgpa);

    }

    public static boolean findCGPA(double cgpaNumber) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        boolean isfound=false;
        Arrays.sort(cgpa);

        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] == cgpaNumber) {
                isfound = true;
                break;
            }

        }

        return isfound;
    }
}
