package extraRepeatExamples;

import java.util.Scanner;

public class AnagramArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String name = input.next();
        char[] name1 = name.toCharArray();
        String reverse ="";
        boolean isAnagram = false;
        for(int i = name1.length-1; i>=0; i--){
            reverse += name1[i];
            if(reverse.equals(name)){
               isAnagram = true;
            }
        }
        System.out.println(isAnagram +" "+  reverse);
    }
}
