package office_hours.practice_9_29;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {


       /*
       Given an ArrayList of Strings,
       go through and read only Strings that are 4 characters or less.
       Take those Strings and put them into a different ArrayList
       Ex:Input:
       “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
       Output:
       [ tree, loop, cat ]
        */
       public static void main(String[] args) {
           ArrayList list = new ArrayList(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut","four","friday"));
           System.out.println(getWordsLessThanFour(list));
           System.out.println(getWordsLessThanFour2(list));

       }





        public  static ArrayList<String> getWordsLessThanFour(ArrayList<String> list ){

         ArrayList<String> validWords = new ArrayList<>();
       // String [] words = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
      //  int count  = 0;
       // String result = "";
        for(String each : list){
            if(each.length() <=4 ) {
               validWords.add(each);

            }
            }
            return validWords;
        }

        public  static  ArrayList<String> getWordsLessThanFour2(ArrayList<String> list){
           list.removeIf(str-> str.length() > 4 );// give the name str just in the code
           return  list;

        }


}

