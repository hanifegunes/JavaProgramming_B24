package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparatePartsTwo {
    public static void main(String[] args) {
       /*
       Write a program that can extract the special characters, digits and letters from a string
and stores them into separate ArrayLists of Characters
Ex: str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
Challenge: make a method that will do this action and it will return an ArrayList which
holds all 3 of the other ArrayLists
Challenge 2: do the original task again, but without a loop. Use lambda


        */
        ArrayList<String> str2 = new ArrayList<>();
        String  parts = "ABCD123$%#@&456EFG!";
        String [] arr = parts.split("");
        ArrayList<String> str = new ArrayList<>();

        String upper = "";
         String lower= "";
         String digit = "";
         String  other = "";
        for(char each : parts.toCharArray()){
           // String upper = "";
            if ((Character.isUpperCase(each))){
                upper += each;
              //  str.add(upper);

            }if ((Character.isLowerCase(each))){
                lower += each;
                str.add(lower);
            }if ((Character.isDigit(each))){
                digit += each;
                str.add(digit);
            }else {
                other+= each;
                str.add(other);
            }

        }
        System.out.println(upper);







    }
}
