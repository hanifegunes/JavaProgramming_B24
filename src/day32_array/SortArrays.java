package day32_array;

import java.util.Arrays;
import java.util.Collections;

public class SortArrays {
    public static void main(String[] args) {
        int [] nums = {4,1,60,-3,5,10};
        Arrays.sort(nums);// from descending order
        System.out.println(Arrays.toString(nums));

        // reverse order
       // Integer [] num ={4,1,60,-3,5,10};
      //  Arrays.sort(num, Collections.reverseOrder());

        System.out.println("Smallest number: "+ nums[0]);
        System.out.println("biggest number: "+ nums[nums.length-1]);
        nums[0] = -4; //arrays are mutable == it can be changed


    }
}
