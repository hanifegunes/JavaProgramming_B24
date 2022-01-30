package extraRepeatExamples_2;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings, go through and read only Strings that are
4 characters or less. Take those Strings and put them into a different
ArrayList
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
Output:
[ tree, loop, cat

         */
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apples");
        arr.add("tree");
        arr.add("loop");
        arr.add("cat");
        arr.add("animal");
        arr.add("shortcut");
        String [] words = {"apples","tree","loop","cat","animal","shortcut"};



        ArrayList<String> four = new ArrayList<>();

        for(String each: words){
            if(each.length() <= 4){
               four.add(each);
            }
        }
        System.out.println(four);
    }
}
