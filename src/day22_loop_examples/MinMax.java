package day22_loop_examples;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //min and max numbers, find min and max

        Scanner input  = new Scanner(System.in);
        int  counter = 1;
        int max= -2147483648;//0
        int min = 2147483647 ;
        while(counter<= 5){
            counter++;
            System.out.println("Enter a number");
            int number = input.nextInt();
            if(number>max){
                max = number;
            } if (number<min){
                min= number;
            }


        }
        System.out.println("max number "+max);


    }
}
