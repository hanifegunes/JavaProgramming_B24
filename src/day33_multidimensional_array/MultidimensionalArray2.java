package day33_multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray2 {
    public static void main(String[] args) {

        int [][] arr = {
                {10, 20, 30, 40}, //a  index 0
                {100, 200, 300, 400}, //b index 1
                 {1000, 2000} //c index 2
        };

        System.out.println(arr[0].length);  // a.length
        System.out.println(Arrays.toString(arr[0])); //10-20-30-40
        System.out.println("--------");
        System.out.println(arr[2].length); // c
        System.out.println(Arrays.toString(arr[2])); // 1000-2000
        System.out.println("-----------");

        System.out.println("first array: " + arr[0][0]); //10== index 0 ==0.element

        System.out.println("second array: "+ arr[1][0]); //index1 0. element = 100

        System.out.println("third array : "+ arr[2][0]);// 1000 ==2. index 0.element



    }
}
