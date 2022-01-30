package day21_loops;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        System.out.println("enter the number");

        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int factorial = 1;
        while(n>0){
            factorial*= n;
            n--;
        }
        System.out.println("factorial ="+ factorial);
        /*int factorial=1;

        for(int num=5; num>0; --num) { // num--
        factorial =num;

        }
        System.out.println(factorial);

        //Factorial number -> 5! -> 5432*1 -> factorial of


         */


    }

}
