package extraRepeatExamples;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine().trim();
        int count = 0;
         for(int i = 0; i < word.length(); i++){
             if(word.charAt(i)== ' '){
            count++;
        }}
        System.out.println(count + 1);




    }
}
