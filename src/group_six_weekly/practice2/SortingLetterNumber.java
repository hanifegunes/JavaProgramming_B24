package group_six_weekly.practice2;

import java.util.Arrays;

public class SortingLetterNumber {
    public static void SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for (int i = 0; i < str.length(); i++) { // looping thoguht the input string

            str2 += "" + str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {// if the current char is a alphabetic character and isnt the last char

                if (Character.isDigit(str.charAt(i + 1))) {// and if the next charatcer is a digit we put concatenate it with a comma

                    str2 += ",";

                }

            }


            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) { // this checks if the current char is a digit

                if (Character.isAlphabetic(str.charAt(i + 1))) {// and the next char is a alphabetic char

                    str2 += ","; // then we concatenate  it with a coma

                }

            }

        }

    }
    /*
     by this point we managed to put a comma and seperate the digits with the alphabetics

    String[] arr = str2.split(","); // spiting it to an array of strings

    str ="";

        for(String each: arr) {

        char[] chars=each.toCharArray(); // maing an array of chars

        Arrays.sort(chars); // 1243=1234 sorting each member of the char array

        for(char eachChar: chars){

            str +=""+eachChar; //str=AB1234  concatenating the sorted char array into a string

        }

    }

        System.out.println(str);
        */

}
