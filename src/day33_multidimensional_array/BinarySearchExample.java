package day33_multidimensional_array;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] nums ={1, 55, 100,200};

        System.out.println(Arrays.binarySearch(nums,55));
        System.out.println(Arrays.binarySearch(nums,200));
        System.out.println(Arrays.binarySearch(nums,300));
        // it not exists , may be in somewhere negative, means not exist
        System.out.println(Arrays.binarySearch(nums,60));//-3
        System.out.println("---------------------");

        int [] not = {49, 30, 2, 1, 60, 23};
        System.out.println(Arrays.binarySearch(not,60));
        System.out.println(Arrays.binarySearch(not,50));
        System.out.println(Arrays.binarySearch(not,49));

        Arrays.sort(not);
        System.out.println(Arrays.binarySearch(not,30));
        System.out.println("-----------------");

     int [] third = {-5, -3, -2, 10, 20};
      int indexOfNeg = Arrays.binarySearch(third, -5);
        System.out.println(indexOfNeg);
        System.out.println("-------------");

        int [] third2 = {-1, -5, -5, -5, -5,  -3, -2, 10, 20};
        int indexOfNeg1 = Arrays.binarySearch(third2, -5);
        System.out.println(indexOfNeg1);




    }
}
