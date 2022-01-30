package day29_arrays;

import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
        Given a String array.
        Find the longest Palindrome String in your array.
        Ex: Input:
         [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
         Output: racecar
         Ex:
         Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
         Output: No palindrome
         */
         String [] word = {"java", "longer word", "civic", "apple",  "racecar", "mom", "anna"};
         String result = "";
         String longest = "";

          for(int i =0; i< word.length; i++) {
              String reverse = "";
              for (int j = word[i].length()-1;j >=0;  j--) {
                  reverse += word[i].charAt(j);
              }
                  if (word[i].equals(reverse)) {
                      result = reverse;

                  if (longest.length() <result.length()){
                      longest =result;
              }
                  }

          }
          if(longest.equals("")){
            System.out.println("no palindrome");
        }else {
            System.out.println(longest);
        }

    }
}
