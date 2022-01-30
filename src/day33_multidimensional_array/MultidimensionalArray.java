package day33_multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int [] a = {1, 2, 3}; // single dimension
        int [] b = {4, 5, 6}; //  single dimension
        int [][] all = {a, b }; // 2d array

        System.out.println(Arrays.toString(all[0])); //1-2-3
        System.out.println(Arrays.toString(all[1]));  //4-5-6

        System.out.println(all.length); //2
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.deepToString(all)); // prints a, b seperatly

        int [][] a2 ={
                {1,2,3},
                {4,5,6}
        }; // 2d array in a single int
        System.out.println("-------------");

        System.out.println(Arrays.deepToString(a2));








    }
}
