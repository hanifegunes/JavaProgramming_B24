package GroupSix.Practice.week_2;

import java.util.Arrays;

public class Permutation {
    /*
    -- Permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters.

     */





    public static String permutation(String[] arr) {

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr.length; y++) {
                for (int x = 0; x < arr.length; x++) {

                    if (i != y && y != x && x != i) {
                        result += arr[i] + arr[y] + arr[x] + " ";



                    }
                }
            }
        }
        return result;


    }

    public static void main(String[] args) {
       // int[] arr = {10,20,7, 8, 90};
        String [] str = {"a","b","c"};

        System.out.println((permutation(str)));
    }

}
