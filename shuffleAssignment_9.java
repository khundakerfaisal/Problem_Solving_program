package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class shuffleAssignment_9 {
    public static void main(String[] args) {
        int[] arrayNumbers={1,2,3,4,5,6,7,8,9,0};

        for (int i = 0; i <arrayNumbers.length ; i++) {
            Random random = new Random();
            int indexNumber = random.nextInt(arrayNumbers.length-1);
            int temp=arrayNumbers[indexNumber];
            arrayNumbers[indexNumber]=arrayNumbers[i];
            arrayNumbers[i]=temp;

        }
        System.out.print(Arrays.toString(arrayNumbers));
        
    }
}
