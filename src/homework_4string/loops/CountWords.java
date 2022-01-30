package homework_4string.loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = input.nextLine();
        int count = 1;
        for ( int i = 0;  i<sentence.length()-1; i++ ){
          sentence =  sentence.trim();

            if(sentence.charAt(i) ==' ' && (sentence.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of words "+ count);



    }
}
