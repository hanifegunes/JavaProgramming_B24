package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();
        int [] nums = new int [size];

        //int [] nums = {4, 6, 2, 10}; -> hard coded

        for( int i =0; i < size ; i++){ // i< nums.length
            System.out.println("Enter a number "+ (i+1)); // i = 0 so i + 1 = 1
            nums[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(nums));

        double sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Average number is: "+ (sum/nums.length));
        // 22 / 4
    }
}
