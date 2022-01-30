package day29_arrays;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {
        int [] ages = { 10, 14, 21, 80, 50, 70, 30, 40, 10};
        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[ages.length-2]);//40
        System.out.println(ages[7]);// 0-1-2-3-4-5-6-7 ==40


       double[] scores = { 90.3, 80.13, 40.50, 19.9, 100.0, 50};
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));
        System.out.println("-----------");
        System.out.println(scores[0] +scores[1]);//90.3 +80.13

    }
}
