package office_hours.practice_10_14;

import java.util.Arrays;

public class SortEachLetterNumber {
    /*
     Sort Letters and Numbers from alphanumeric String
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     sort the individual string and append them back together
     Input:"DC501GCCCA098911"
     OutPut: "CD015ACCCG011899"
     DC
     how do we find the substrings
     currentChar letter ? is next one (i+1) letter? -> good
     currentChar letter ? is next one (i+1) is not a letter? -> we found the substring
     current char digit? is next one (i+1) digit -> good
     current char digit? is next one (i+1) is not a digit ->we found a substring
     when we are on the last letter length-1
     force the action to happen-> assuming the last character is part of the substring


     Actions:
     sort this substring
     assign sorted substring to final string
     reset current substring to be empty


     */
    public static void main(String[] args) {


        System.out.println(sortEachPart("DC501GCCCA098911"));




    }



    public static  String sortEachPart(String str){
        String sub = "";
        String sortedStr="";
        for(int i = 0; i<str.length(); i++){
            char current = str.charAt(i);
            sub += current;
            boolean sort = false;
            if(i != str.length()-1) {
                char next = str.charAt(i + 1);


                sort = i == str.length() - 1 || Character.isLetter(current) && !Character.isLetter(next) ||
                        Character.isDigit(current) && !Character.isDigit(next);
            }  else {
                sort = true;
            }
            if(sort){
               // char [] toSort = sub.toCharArray();
                String [] toSort = sub.split("");
                Arrays.sort(toSort);
              //  System.out.println(sub);
                // sortedStr+=Arrays.toString(toSort).replace("[","").replace("]","").replace(",","")
               // System.out.println(Arrays.toString(toSort).replace("[","").replace("]","").replace(",",""));
                sortedStr += String.join("",toSort);
                sub = "";
            }
        }
         return null;
    }

}
