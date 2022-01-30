package day14_nested_if;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       // int number =15;
        //if( number %3 == 0){
         //   System.out.println("Fizz");
       // } else if( number %5 == 0){
         //   System.out.println("Buzz");
       // }else if (number %5 == 0 && number %3 == 0 ){
       //     System.out.println("FizzBuzz");
        if (number %5 == 0 && number %3 == 0 ){
                 System.out.println("FizzBuzz");}
         else   if( number %3 == 0){
                  System.out.println("Fizz");
                } else if( number %5 == 0){
                System.out.println("Buzz");}
         else {
            System.out.println(number);
        }



    }
}
