package homework_3If;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int first,second,third;
        first = 4;
        second = 8;
        third = 1;

        if(second < first && first > third){
            System.out.println("The greatest number from "+ first+","+ second+","+ third+","+ "is: "+first);}
        else if(first < second && second > third){
            System.out.println("The greatest number from "+ first+","+ second+","+ third+","+ "is: "+second);}

        else if(first < third && third > second){
            System.out.println("The greatest number from "+ first+","+ second+","+ third+","+ "is: "+third);}
        /* Write a Java program to implement following logic using if statement1. if hour is less than 12 noon, greet with Good Morning2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon3. if hour is greater than or equal to 3 pm, greet with Good Evening

         */
        Scanner input = new Scanner(System.in);
        System.out.println("what is the time");
        int hour = input.nextInt();
        if (12 > hour && hour > 6){
            System.out.println("good morning");}
        else  if (12 < hour && hour < 16){
            System.out.println("good afternoon");}
        else  if (16 < hour && hour < 20){
            System.out.println("good evening");}
        else  if (20 < hour && hour < 24  || hour < 4){
            System.out.println("good evening");}





    }
}
