package extraRepeatExamples;

import java.util.Scanner;

public class CountLettersDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();
        System.out.println("enter letter");
        char letter = input.next().charAt(0);
       // int count = 0;
        String result ="";
        for(int i = 0; i < word.length(); i++){
            int count = 0;
            for(int  j = 0; j < i;j++){



            if(word.charAt(j) == letter){
                count++;
               // result =""+count;
            }
           // System.out.println( letter + "found" +count+"times");
              //  result =""+count;
        }
            result =""+count;
           // System.out.println( letter + "found" +count+"times");
        }
        //System.out.println( letter + "found" +count+"times");
        System.out.println(letter+ " found "+result+ " times ");
    }
}
