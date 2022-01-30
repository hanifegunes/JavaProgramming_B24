package day29_arrays;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {
        /*
        Ask the user to enter a month number
        Print which month they select
        1-> January
        ..
        12 -> December
         */
        Scanner input = new Scanner(System.in);
        String [] months = {
                "Jan", "Feb", "Apr","May","June","July","Aug", "Sep", "Oct", "Now", "Dec"
        };
        // begins from 0 so user enters 1 it gives feb so, print is months[num-1] 1-1=0 1 gives jan now...
        System.out.println("Enter a month number: ");
        int num = input.nextInt();

        System.out.println("The month you picked id: "+months[num-1]);// allows us to go from a number to an index

    }
}
