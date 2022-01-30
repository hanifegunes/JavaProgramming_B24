package day25_loop_practice;

public class BiggestSubstring {
    public static void main(String[] args) {
         /*Given a String find the biggest substring of
         chars that match and print it
         Ex: aaabbbcccccddddee

         Output: ccccc


          */
     String str = "aaabbbcccccddddee";
     int biggest = 0;
     String longestSub = "";
     String other = "";

     for ( int i = 0; i< str.length()-1; i++ ){
          other += ""+ str.charAt(i);
         if (str.charAt(i) != str.charAt(i+1)){
             if (other.length() > longestSub.length()){
                 longestSub = other;
             }
             other = "";

         }



     }
        System.out.println(longestSub);

    }
}
