package extraRepeatExamples_2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConvert {
    public static void main(String[] args) {

           Integer [] i = {1,2,3};
           Arrays.asList(i);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(i));
        list.set(0,i.length-1);
        list.set(i.length-1,1);

        System.out.println(list);
        System.out.println("----------------");

        int [] num = {1,2,3,400};

        for(int j =0; j<num .length; j++){
            num  [0]=num [num.length-1];

        }
        System.out.println(Arrays.toString(num));
        System.out.println("-----------");

        int[] nums = {20, 30, 40};
        System.out.println("Original Array: "+Arrays.toString(nums));
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(nums));
    }
    /*
    int[] array = new int[5];
    int i = array[0];
    int j = array[array.length - 1];


     int hold = array[i];
     array[i] = array[j] ;
     array[j] =  hold;
     for (int k = 0; k < 5; k++) {
         System.out.print(array[k]);
    }

    public static void swap(int [] arr) {

    int last = arr.length-1;
    int temp = arr[0];
    arr[0]  = arr[last];
    arr[last] = temp
     */



    }



