package day32_array;

import java.util.Arrays;

public class StringSortArray {
    public static void main(String[] args) {
     String[] strs = {"4java","8eight", "hello","HEllo", "Hello","$dollar"} ;
     Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));//1- special characters,2- numbers 3-upper,upper than lower,all lower case



    }
}
