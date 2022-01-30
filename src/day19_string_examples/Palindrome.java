package day19_string_examples;

public class Palindrome {  // tenet, madam,obo, but checks just ONLY  3 characters
    public static void main(String[] args) {

      String word = "abc";
      String reverse = "" +word.charAt(2) +word.charAt(1)+word.charAt(0);
        System.out.println(reverse);
        String word2 = "mom";
        String reverse2 = "" +word2.charAt(2) +word2.charAt(1)+word2.charAt(0);
        System.out.println(reverse2);
        if(word2.equals(reverse2)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");


        }

        if(word.equals(reverse2)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");


        }

    }
}
