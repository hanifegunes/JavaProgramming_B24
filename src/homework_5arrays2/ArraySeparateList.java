package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySeparateList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        String str = "ABCD123$%#@&456EFG!";
        String[] strTwo = str.split("");

        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> digits = new ArrayList<>();
        ArrayList<String> lowerLetter = new ArrayList<>();
        ArrayList<String> others = new ArrayList<>();
       // char[] ch = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                letters.add("" + str.charAt(i));


            }  if (Character.isLowerCase(str.charAt(i))) {
                lowerLetter.add("" + str.charAt(i));


            }
            if (Character.isDigit(str.charAt(i))) {
                digits.add("" + str.charAt(i));


            } else  if(!Character.isUpperCase(str.charAt(i)) && !Character.isLowerCase(str.charAt(i))&& !Character.isDigit(str.charAt(i))  ){
                others.add("" + str.charAt(i));


            }


        }
        System.out.println(letters);
        System.out.println(lowerLetter);
        System.out.println(digits);
        System.out.println(others);


    }


}
