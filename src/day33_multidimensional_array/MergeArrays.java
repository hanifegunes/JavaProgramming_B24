package day33_multidimensional_array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [][] nums = {
                {10, 20, 30}, {5, 10, 15} /// a,b
        };
        // task: take the elements from the 2d array and put all the numbers into a single array.
        // format; all elements from first, then all from second etc..

       // int size = nums.length; // 2 part will give just 2
        int size = nums[0].length +nums[1].length; // now it gives 6 elements

       // int [] merged = new int [6];===6 = size now, but with size it's dynamic

        int [] merged = new int [size];//

        merged[0] = nums[0][0]; //10
        merged[1] = nums[0][1] ; // 20 ==0 is the first group, 1. index
        merged[2] = nums[0][2]; // 30 ==
        merged[3] = nums[1][0]; // 5==  now we are in the 2. group 0.index
        merged[4] = nums[1][1]; // 10
        merged[5] = nums[1][2]; // 15

        System.out.println(Arrays.toString(merged));



    }
}
