package Assignment;

import java.util.Scanner;

public class luckyDrawAssignment_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] luckyDrawNumbers = {100, 150, 140, 180, 170, 200, 250, 230, 220, 300};
        int count = 0;

        for (int i = 0; i < luckyDrawNumbers.length; i++) {
            System.out.print("Enter the number if you are lucky:");
            int inputNumber = scanner.nextInt();
            int index = (int) (Math.random() * luckyDrawNumbers.length);
            int generateRandNumber = luckyDrawNumbers[index];
            if (inputNumber == generateRandNumber) {
                System.out.println("You are lucky!");
                break;
            }
            else {
                System.out.println("Better luck next time!");
                count++;
            }
            if (count == 2) {
                System.out.println("Bad Luck ! You have cross the maximum number of tries!");
                break;
            }
        }
    }
}
