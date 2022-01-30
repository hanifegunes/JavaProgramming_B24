package day32_array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

      /*
      Anagram is 2 words, they are built up of the same character
      abc ==acb = bca

     */
        String  one = "listen";
        String two = "silent";
        // convert Strings to char arrays, to be able to compare  each character
         char [] oneArr = one.toCharArray();
         char [] twoArr = two.toCharArray();

         //sort the character in order
        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
        System.out.println("is Anagram: "+ Arrays.equals(oneArr,twoArr));





    }
}
