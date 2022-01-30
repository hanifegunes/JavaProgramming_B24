package homework_4string.loops;

import java.util.Scanner;

public class PalindromeLoop {
    public static void main(String[] args) {// String reverse2 = "" +word2.charAt(2) +word2.charAt(1)+word2.charAt(0);
       // String word ="aziza";
       // for ( int i = 1;  i<word.length(); --i ){
          //  System.out.println(word.charAt(i));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        String reverse = "";

        for ( int index = word.length()-1; index >= 0; index-- ){
            reverse += word.charAt(index);



        }
        System.out.println(reverse);
        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
