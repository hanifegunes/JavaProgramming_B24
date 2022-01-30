package homework_5arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers");
        int size = input.nextInt();
        int [] nums = new int[size];
        int num = 0;
        for (int i = 0; i< size; i++ ){
            System.out.println("enter the numbers");
           nums [i] = input.nextInt();
           num = nums[size -1];

        } int nums2 [] = new int [size*2];
        nums2[nums.length-1] = num;
        System.out.println(Arrays.toString(nums2));


    }
}
