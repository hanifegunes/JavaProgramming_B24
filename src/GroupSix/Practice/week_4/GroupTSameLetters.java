package GroupSix.Practice.week_4;

import java.util.Arrays;

public class GroupTSameLetters {
    public static void main(String[] args) {
        System.out.println(SameLetter("abc","cba"));

    }


    public  static  boolean SameLetter(String word1, String word2){
        boolean isSame = false;
        String [] arr1 = word1.split("");
        String [] arr2 = word2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            isSame = true;
        }

        return isSame;
    }

}
