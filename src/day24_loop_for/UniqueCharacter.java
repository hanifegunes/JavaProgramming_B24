package day24_loop_for;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        System.out.println("enter the letter");
        String letter = input.next();
        int count = 0;
         for (int i = 0;  i< word.length(); i++ ){
             if(word.contains(letter) && letter.indexOf(i)== 1){
                 System.out.println("unique "+ letter);
             }else {
                 System.out.println(letter + " is not unique");
             }

         }



    }
}
