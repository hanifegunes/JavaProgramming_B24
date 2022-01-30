package day14_nested_if;

import java.util.Scanner;

public class DaysInMonth2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month number");
        int month = input.nextInt();
        if(month >= 1 && month <= 12){

            if(month == 2){
                System.out.println("28 days");
            } else if(month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }

        } else {
            System.out.println("Invalid month number. Can only be from 1-12");
        }

    }

}