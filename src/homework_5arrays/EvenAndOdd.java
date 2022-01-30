package homework_5arrays;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
        int [] numbers = {4,1,3,12,5 };
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
               countEven++;
            } else if (numbers[i] % 2 != 0){
                countOdd++;

            }
        }
        System.out.println("Total Even numbers: "+ countEven + Arrays.toString(numbers));
        System.out.println("Total Odd numbers: " + countOdd);
    }
}
