package Assignment;

public class highest2ndNumberPrintAssignment_2 {
    public static void main(String[] args) {
        double[] cgpaGrade = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        int highestScore =0;
        int secondHighestScore = 0;
        for (int i = 1; i < cgpaGrade.length; i++) {
            if (cgpaGrade[i] > cgpaGrade[highestScore]) {
                secondHighestScore=highestScore;
                secondHighestScore =i;
            }
        }
        System.out.println("2nd highest grade :"  + " " + cgpaGrade[secondHighestScore]);

    }
}
