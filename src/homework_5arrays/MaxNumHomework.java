package homework_5arrays;

import java.util.Scanner;

public class MaxNumHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");




        int [] number = new int [input.nextInt()];
        int max = -234567432;
        int min = 243567123;

         for(int i = 0; i< number.length; i++ ){
             System.out.println("enter the number: "+ (i+1));
             number[i] = input.nextInt();
             if(number[i] > max){
                 max = number[i];

                // System.out.println("max: "+ max);
             }
             if( number[i] < min){
                 min = number[i];
                // System.out.println("min: "+ min);
             }

         }
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);












    }
}
