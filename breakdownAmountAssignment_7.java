package Assignment;

import java.util.Scanner;

public class breakdownAmountAssignment_7 {

    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int totalCount =0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the number :");
        int inputAmount = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < notes.length; i++) {
            if (inputAmount >=notes[i]) {
                totalCount=inputAmount/notes[i];
                inputAmount = inputAmount -(totalCount*notes[i]);
                System.out.println(notes[i]+" "+totalCount);
            }

        }

    }
}

