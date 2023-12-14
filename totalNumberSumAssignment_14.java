package Assignment;

import java.util.Scanner;

public class totalNumberSumAssignment_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input a number");

        while (true) {
            String character = scanner.nextLine();
            if (character.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(character);
                sum += number;
            } catch (Exception e) {
                System.out.println("inputs wrong character! please enter the number again ..");
            }

        }
        System.out.println("Total sum of the numbers is = " + sum + " ");
    }
}
