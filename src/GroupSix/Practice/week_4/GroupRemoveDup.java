package GroupSix.Practice.week_4;

public class GroupRemoveDup {
    public static void main(String[] args) {
        /*
        Remove Duplicates.
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
        String  str = "AAABBBCCC";
        System.out.println( getRemoveDuplicates(str));


    }
    public static String getRemoveDuplicates(String  word){


        int count = 0;
        String unique = "";


        for(int i = 0; i< word.length(); i++){
            if (!unique.contains(""+word.charAt(i))) {
                    unique += ""+ word.charAt(i);

                }
            }return unique;
    }
}
