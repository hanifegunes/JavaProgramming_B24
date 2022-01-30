package day29_arrays;

import java.util.Scanner;

public class LargestSmallerName {
    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);
       // System.out.println("How many words do you want to enter");

        //String [] words = new String[input.nextInt()];
        String [] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia",  "United States", "Russia" };
        String  smaller = countries[0];
        String largest = countries[0];
        for (String each : countries){
            if( each.length() < smaller.length()){
               smaller = each;
            }  if (each.length() > largest.length()){
                largest = each;
            }
        }
        for (int i = 0; i<countries.length; i++){
            String each = countries[i];
            if(each.length() < smaller.length()){
                smaller =each;
            }if( each.length() > largest.length()){
                largest = each;
            }
        }



        System.out.println("Smaller "+ smaller);
        System.out.println("largest "+ largest);

    }
}
