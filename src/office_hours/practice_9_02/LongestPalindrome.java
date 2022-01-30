package office_hours.practice_9_02;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*
         Longest Palindrome
Given a String array.
Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
Output:
racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"} ;
        String longest = "";

      for(String eachWord : words){
          boolean isPalindrome = true;

          for (int i = 0; i < eachWord.length()/2; i++) {
              if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) { // civic== 0 =? length-1,ok then i = 1 so char 1=? char.length -1 -1
                  // the length -1 -i
                  // part allows you to read the characters from the same number of iterations that i goes forwards
                  // instead of this approach you could have also made another variable that starts from the last index and decrements everytime

                  isPalindrome = false;
                  break;
              }
          }

              if (isPalindrome && eachWord.length() > longest.length()){
                  longest = eachWord;
              }
          }
          System.out.println("longest: "+ (longest.isEmpty() ? "No polindrome " : longest));






    }
}
