package day29_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double [] prices = new double[5];// array size is fixed .. this just has always will have 5 elements,no 4 or no 6
        prices[0] = 25.99;
        System.out.println(Arrays.toString(prices));

        prices[1] = 38.5;
        prices[2] =50.2;
        prices[3] =90.5;
        prices[4] =100.5;
        System.out.println(Arrays.toString(prices));
        System.out.println("-------");

        prices[2] =2000.5;
        System.out.println(Arrays.toString(prices));
        System.out.println("=======");
        prices = new double[2];// reassigned now 2 is 2000.5
        System.out.println(Arrays.toString(prices));//0-0

        String str = "java";
        str = "saturday"; // reassigned now str is saturday




    }
}
