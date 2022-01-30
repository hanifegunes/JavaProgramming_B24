package extraRepeatExamples;

import java.util.Scanner;

public class CountUpperLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();
        int upper = 0;
        int lower = 0;
        int num = 0;
        int others = 0;
        for(int i = 0; i< word.length(); i++){
            if(word.charAt(i) >=  'A' && word.charAt(i) <= 'Z'){
                upper++;

            }
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                lower++;
            }else if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                num++;
            }else {
                others++;

            }
        }
        System.out.println("upper "+ upper+" lower "+lower+ " nums "+num+ " others "+others);







    }
}
