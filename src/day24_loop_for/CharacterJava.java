package day24_loop_for;

import java.util.Scanner;

public class CharacterJava {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.nextLine();
        for(int index = word.length()-1; index >= 0; index++ ){
            if(word.contains("a")){
                System.out.println(word.charAt('a'));
            }
        }
         if(str.charAt(0) == 'a') {
          count++;}
          if(str.charAt(1) == 'a') {
          count++;}
          if(str.charAt(2) == 'a') {
          count++;}  ==== loop makes it char(i)


         */
        String str = "java has apples";
        int count = 0;

         for ( int i = 0;  i<str.length(); i++ ){  // i-> str.length()-1=== like i<=4 ,or i<5
             if(str.charAt(i) == 'a'){
         count++;


             }

         }

        System.out.println("a was found " + count +" times");





    }
}
