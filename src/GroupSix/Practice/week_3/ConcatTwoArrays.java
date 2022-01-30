package GroupSix.Practice.week_3;

import java.util.Arrays;

public class ConcatTwoArrays {
    /*
     Concat two arrays
Write a return method that can concate two arrays.
     */

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(method1(arr1,arr2)));

    }

    public  static int [] method1( int [] one, int [] two){
     int [] result = new int [one.length+two.length];
     int index=0;

        for (int i = 0; i < one.length; i++) {
            result[i]= one[i];
            index++;

        }
        for(int i=0;i<two.length;i++){
            result[index]=two[i];
            index++;
        }
          return result;



    }


}
