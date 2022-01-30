package day21_loops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter 5 number");


        int total  = 0;
        int  next= input.nextInt();
       while(next > 0 ){
            total = total+ next;
            next = input.nextInt();

                System.out.println(+total );

        }



    }

}
