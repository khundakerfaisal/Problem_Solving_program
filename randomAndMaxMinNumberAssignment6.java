package Assignment;

import java.util.Random;

public class randomAndMaxMinNumberAssignment6 {
    public static void main(String[] args) {
        int [] number = new int[10];
        int max = 0;
        int min = 0;
        for (int i = 0; i < number.length; i++) {
            Random random =new Random();
            number[i] = random.nextInt(10);
            String print = String.valueOf(number[i]);
            System.out.println(print);

            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }

        }

        System.out.println("max number is :"+max);
        System.out.println("min number is :"+min);
    }

}
