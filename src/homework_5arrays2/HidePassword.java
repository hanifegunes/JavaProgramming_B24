package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Given an array of passwords (String). Hide each password as a star (*)
and show the hidden password
Ex:
Input:
{"one", "hi", "hold}
Output:
[ ***, **, ****

     */
    public static void main(String[] args) {


       // ArrayList<String> list = new ArrayList<>();
       // ArrayList<String> arr = new ArrayList<>();
        String [] password = {"one", "hi", "hold"};
        ArrayList<String> arr = new ArrayList<>(password.length);
         // String str ="";
        for (String each : password) {
            String str ="";
            for(int j = 0; j< password.length; j++){
                str += "*";
            }
           arr.add(str);
        }
        System.out.println(arr);

    }

}
