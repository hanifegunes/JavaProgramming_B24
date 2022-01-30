package day25_loop_practice;

import java.util.Scanner;

public class CountUpperLower {
    public static void main(String[] args) {
       /*
       Given a String, find and print how many uppercase letter,
        lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4
        Output:3 uppercase letters6 lowercase letters5 numbers
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        int upper = 0;
        int lower = 0;
        int number = 0;


        String str  = input.next();
        for(int i = 0; i< str.length(); i++){
            char eachChar = str.charAt(i);

          if(eachChar>= 'A' && eachChar <= 'Z' ) {
              upper++;

          }else if (eachChar>= 'a' && eachChar<= 'z'){
              lower++;
          }else if(eachChar>= '0' && eachChar<= '9'){
              number++;
          }

        }
        System.out.println("number of upper case :"+upper+"\nnumber of lower cases: "+ lower + "\nnumber of numbers: "+ number);



    }
}
