package homework_5arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GetUpperLower {
    public static void main(String[] args) {
        /*
        The method will accept a String and a boolean.
- If the given boolean is true, then extract all the uppercase letters and return them
in an ArrayList.
- If the given boolean is false, then extract all the lowercase letters and return
them in an ArrayList
@param str - Given String
@param isUpper - Given boolean
@return - ArrayList of String
         */

        ArrayList<String >list = new ArrayList<>(Arrays.asList("A","C","d","e"));
        System.out.println(getUpperOrLower(list.get(3),true));


    }

    public  static String getUpperOrLower(String str,boolean isUpper ) {
       // ArrayList<String> upper = new ArrayList<>();
       // ArrayList<String> lower = new ArrayList<>();
        String upper= "";
        String lower = "";


        for (int i = 0; i< str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                upper +=(""+str.charAt(i));
                isUpper = true;
            }
            if(Character.isLowerCase(str.charAt(i))){
                lower +=(""+str.charAt(i));
                isUpper = false;
            }
        }
         return upper+lower;

    }

}
