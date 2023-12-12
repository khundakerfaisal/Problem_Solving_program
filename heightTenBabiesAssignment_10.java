package Assignment;

import java.util.Scanner;

public class heightTenBabiesAssignment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumberFirst = Integer.MAX_VALUE;
        int minNumberSecond = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height of baby " + i + " ");
            int height = scanner.nextInt();
            if (height < minNumberFirst) {
                minNumberSecond = minNumberFirst;
                minNumberFirst = height;
            } else if (height < minNumberSecond) {
                minNumberSecond = height;
            }
        }

        System.out.println("The two lowest heights are " + minNumberFirst + " cm and " + minNumberSecond + " cm.");
    }

}
