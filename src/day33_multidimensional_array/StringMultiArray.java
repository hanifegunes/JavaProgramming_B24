package day33_multidimensional_array;

import java.util.Arrays;

public class StringMultiArray {
    public static void main(String[] args) {
      String [][] cybertek = new String[4][]; // how many single elements string array has == 2.nd [] is empty means its flexible, but if we [3] there  must have 3 elements
        System.out.println(cybertek.length); // 4
        System.out.println(Arrays.deepToString(cybertek));//null null null null ==because there is no element yet
        System.out.println("-------------");


        String [] groupOne = new String[2];
        String [] groupTwo = new String[2];
        String [] groupThree = new String[2];
        String [] groupFour = new String[2];

        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));












    }
}
