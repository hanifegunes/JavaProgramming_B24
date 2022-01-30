package GroupSix.Practice.week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GroupCountLettersArrayList {

    // input:AAAABBCCCDDDDDDEE
    //output: 4A2B3C6D2E

    public static String countEachLetter(String str){
        // how do we convert String to ArrayList

        /*

            We start with String str = AABCDD
            String [] arr = str.split(""); -> ["A", "A", "B", "C", "D", "D"] as String array

            Array.asList() -> this method accepts the arrays and converts those arrays to an ArrayList

            Arrays.asList(arr) -> ["A", "A", "B", "C", "D", "D"] as an ArrayList

            new ArrayList() -> when we put a collection type inside of the parenthesis it makes the ArrayList with those values
          explanation of ---  ArrayList<String>list = new ArrayList<>(Arrays.asList(str.split("")));
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result ="";
        for(String each : list){
            if(!result.contains(each)){

                int count = Collections.frequency(list,each);
                result += each +count;
            }}
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(countEachLetter("AAAABBCCCDDDDDDEE"));
    }



}
