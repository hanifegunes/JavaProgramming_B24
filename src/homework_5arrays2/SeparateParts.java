package homework_5arrays2;

import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
      /*
        Write a program that can extract the special characters,
         digits and letters from a string and stores them into
         separate ArrayLists of Characters
         Ex:
         str = "ABCD123$%#@&456EFG!"
         list1: {$, %, #, @, &, !}
         list2: {A, B, C, D, E, F, G}
         list3: {1, 2, 3, 4, 5, 6}
         Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the other ArrayLists
         Challenge 2: do the original task again, but without a loop. Use lambda
       */
        String  sentence = "ABCD123$%#@&456EFG!";

        String [] parts = sentence.split("");
        System.out.println(Arrays.toString(parts));
       //for(String each : parts){
        String upper = "";
        String lower ="";
        String digit = "";
        String other = "";
            for(char each : sentence.toCharArray()){
            if(Character.isUpperCase(each)){
                upper += each;

            }if(Character.isLowerCase(each)){
                lower += each;

        }if(Character.isDigit(each)){
                digit +=each;
                }
                else{ if(!Character.isDigit(each) && !Character.isLowerCase(each) && !Character.isUpperCase(each) )
                    other += each;
                }

                }
        System.out.println((upper));
        System.out.println(lower);
        System.out.println(digit);
        System.out.println(other);



    }
}
