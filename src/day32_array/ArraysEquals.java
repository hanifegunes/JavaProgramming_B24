package day32_array;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = {3,2,1};
        int [] d = {3,2,1,0};
        System.out.println( Arrays.equals(a,b));// true
        System.out.println( Arrays.equals(a,c)); // false, order matters
        System.out.println( Arrays.equals(c,d)); // false, size matter
        System.out.println("==============");
        Arrays.sort(c); // order of c changed 1-2-3 now
        System.out.println( Arrays.equals(a,c)); // true





    }
}
