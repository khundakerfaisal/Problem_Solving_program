package Assignment;
public class highestToLowestShortAssignment_3 {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int count =cgpa.length;
        double temp=0;
        String message = "Highest score to lowest score shorting\n";
        System.out.print(message);

        for (int i = 0; i < cgpa.length; i++) {
            for (int j = i + 1; j < count; j++) {
                if (cgpa[i] < cgpa[j]) {
                    temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
            System.out.println(cgpa[i]);
        }
    }
}
