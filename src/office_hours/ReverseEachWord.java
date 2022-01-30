package office_hours;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words separate by a space");

        String original = input.nextLine().trim();
        String [] words = original.split(" ");
       // String [] words = input.nextLine().trim().split(" ");
        String result = "";

      for(String eachWord : words) {
          System.out.println(eachWord); //java is fun == wi;; be separated;
          String reverse = "";
          for (int i = eachWord.length() - 1; i >= 0; i--) {
              reverse += eachWord.charAt(i);

          }
          result += reverse + " ";
         // System.out.println(reverse);
      }
          System.out.println("original: "+original );
          System.out.println("reverse: "+ result);







    }
}
