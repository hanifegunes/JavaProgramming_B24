package day25_loop_practice;

import java.util.Scanner;

public class CountWordsClass {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));
        System.out.println("Enter the sentence");
        String str= input.nextLine().trim();
        int numberOfSpaces = 0;
        for( int i = 0; i < str.length(); i++){ // i <= str.length()=1
           if( str.charAt(i)== ' ')
            numberOfSpaces++;

        }

        System.out.println("number of words: "+ (numberOfSpaces+1));
       // without loop
     int originalLength = str.length();
     int newLength = str.replace(" ", "").length();
        System.out.println("words "+ (originalLength-newLength+1));





    }
}
