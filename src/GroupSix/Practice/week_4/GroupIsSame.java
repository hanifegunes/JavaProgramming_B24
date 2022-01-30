package GroupSix.Practice.week_4;

import java.util.Arrays;

public class GroupIsSame {
    public static void main(String[] args) {
        String one = "abc";
        String two = "cba";
        String three = "dca";

        System.out.println(SameLetters("ads","gfh"));

    }





    public static boolean SameLetters(String word1, String word2){
        boolean isWord=false;
        String[] arr1=word1.split("");
        String[] arr2=word2.split("");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        if (Arrays.equals(arr1,arr2)) {
            isWord=true;
        }
        return isWord ;
    }





}
