package homework_5arrays;

import java.util.Arrays;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        /*
        Given an Array of numbers.
         Find and print the 2nd biggest number.
          Note the 2nd biggest should be unique
           meaning it should be different from the max number
           Example:Input:[4,3,1,4,5,2,4,8,4,8]
           Output:5

         */

        int [] nums = {4,3,1,4,5,2,4,8,4,8};
        int max = nums[0];

        Arrays.sort(nums);
       // System.out.println("biggest number: "+ nums[nums.length-1]);
       // System.out.println("second biggest number: "+ nums[nums.length-3]);
        System.out.println(Arrays.toString(nums));
        String numDuplicate = "";

        for (int i = 0; i < nums.length; i++) {
            String each = "" + nums[i];
            if (!numDuplicate.contains(each)) {
                numDuplicate += each;
            }
        }
           char [] numDuplicated = numDuplicate.toCharArray();
        int second = numDuplicated.length-1;
        System.out.println(second);
            }

        }






