package GroupSix.Practice.week_2;

import java.util.Arrays;

public class ArrayShortAscending {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
       // arr = Sort(arr);==>{ 7, 8, 9, 10};
         int[] arr2 = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(method1(arr)));
        System.out.println(Arrays.toString(method2(arr2)));




    }
    /*
    Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);==>{ 7, 8, 9, 10};

     */

    public  static int[] method1(int [] number){
      //  int [] newNum = new int[number.length];
        int temp = 0;
        for(int i = 0; i<number.length; i++){
            for(int j = 0; j< number.length; j++){

            if(number[i] > number[j]){

               temp= number[i];
               number[i]= number[j];
                number[j]= temp;



            }}
        } return number;
    }

    public  static int[] method2(int [] number){

        int temp = 0;
        for(int i = 0; i<number.length; i++){
            for(int j = 0; j< number.length; j++){

                if(number[i] < number[j]){

                    temp= number[i];
                    number[i]= number[j];
                    number[j]= temp;



                }}
        } return number;
    }





}







