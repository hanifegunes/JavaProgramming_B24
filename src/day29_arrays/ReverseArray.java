package day29_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4 ,5};
        int[] reverseArray = new int[array.length];

        int j = 0;
        for (int i = array.length -1; i>= 0 ; i--){
            reverseArray[j++] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));
    }
}
