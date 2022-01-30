package day33_multidimensional_array;

import java.util.Arrays;

public class SumArraysCopy {
    public static void main(String[] args) {
        // i want to calculate the sum and put the sum value to a new element at the end

        int [] arr = {1,5,2,5};
        // 1 5 2 5 sum 13
        int sum = 0;
       int [] newArr = Arrays.copyOf(arr,arr.length+1);

        for(int num : arr){
            sum += num;


        }
        newArr[newArr.length-1] = sum; // son indekse toplami atiyor
        System.out.println(sum);
        System.out.println(Arrays.toString(newArr));



    }
}
