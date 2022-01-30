package day24_loop_for;

import java.util.Scanner;

public class UniqueCharacterSaim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("enter the letter");
        char letter = input.next().toLowerCase().charAt(0);
        int count = 0;
        /*
        instead of char letter = input.next().toLowerCase.charAt(0);
        String s = input.next();
        s = s.ToLowerCase();
        char l = s.charAt(0);
         */

        for ( int i = 0;  i<word.length(); i++ ){
            if( word.charAt(i)== letter){
                count++;

            }

        }
        if (count == 1){
            System.out.println(letter+ " is unique");
        }else if (count== 0){
            System.out.println(letter +" was in the string ");
        }else {
            System.out.println(letter+ " is not unique");
        }


    }
}
