package GroupSix.Practice.week_8;

import java.util.Arrays;

public class ReverseString {

    public static void main(String [] args) {

         String str4 = "anna";
        String reverse = "";

       // StringBuilder reverse1 = new StringBuilder();
        String reverse1 = "";
       // boolean isAnagram =false;

        for(int i= str4.length()-1; i>=0;  i--) {
            // reverse += str.charAt(i);
            reverse1 +=(str4.charAt(i));

        }
        System.out.println(reverse1.toString()+"========");
        if(reverse1.equals(str4)){
            System.out.println("anagram");
        } else {
            System.out.println("not");
        }


            String str = "abcd";
        String reverse5 = "";
        String word = "ada";

        System.out.println(getAnagram(word));


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse5 += str.charAt(i);

        }
        System.out.println(reverse);
        System.out.println(getReverse(str));


        String[] arr = {"abc", "wer", "ger"};
        String reverse6= "";
        System.out.println("===============");

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse6 += arr[i]+" ";




        }
        System.out.println(reverse6);







    }



         public static String getReverse(String str){
        StringBuilder reverse2 = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse2.append(String.valueOf(str.charAt(i))) ;

        }

         return  reverse2.toString();

    }



    public  static   boolean getAnagram(String str){

        String reverse = "";
        StringBuilder reverse1 = new StringBuilder();
          boolean isAnagram =false;

        for(int i= str.length()-1; i>=0;  i--){
           // reverse += str.charAt(i);
            reverse1.append(str.charAt(i)) ;

        }
        if(str.equals(reverse1)){
            isAnagram = true;
        } else if (!str.equals(reverse1)){
            isAnagram = false;
        }

        return isAnagram;
    }

}
