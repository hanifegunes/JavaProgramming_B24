package GroupSix.Practice.week_4;

import java.util.Arrays;

public class GroupAbcDca {
    public static void main(String[] args) {
        String one = "abc";
        String two = "cba";
        String three = "dca";

        System.out.println(getWords("ads","gfh"));


    }

    public static boolean getWords (String one,String two) {

        // String one = "abc";
         //String two = "cba";
        // String three = "dca";

        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();
       // char[] threeArr = three.toCharArray();
        if(one.length()!= two.length()){
            return false;
        }


        boolean isSame = false;
        //sort the character in order
        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
       // Arrays.sort(threeArr);
        if (Arrays.equals(oneArr, twoArr) ) {
            isSame = true;
        }// else {
          //  isSame = false;
      //  }
        return Arrays.equals(oneArr,twoArr);
         //return  isSame;


    }
}
