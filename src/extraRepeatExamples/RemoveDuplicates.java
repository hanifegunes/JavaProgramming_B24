package extraRepeatExamples;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.next();
        int count = 0;
        String unique = "";
        for(int i = 0; i <word.length(); i++){

         if(!unique.contains(""+word.charAt(i))){
             unique += word.charAt(i);
         }}
        System.out.println(unique);

    }
}
