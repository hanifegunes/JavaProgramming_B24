package extraRepeatExamples;

import java.util.Scanner;

public class ReverseSameLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String str = input.next();
        System.out.println("enter second word");
        String str2 = input.next();
        String name ="abc";
        String name2 = "cba";
        boolean isSame = false;
        for(int i = 0; i < str.length(); i++ ){
            for(int j = 0; j < str2.length(); j++){
                // isSame = true;

                if(str.charAt(i) ==str2.charAt(j) ){
                    isSame = true;

                }else if( str.charAt(i) !=str2.charAt(j) ){
                    isSame = false;
            }}}
        System.out.println(isSame);



    }}


        /*
        Same letters
        Write a return method that check if a string is build out of the same letters as another string.
        Ex:  same("abc",  "cab"); -> true
        same("abc",  "abb"); -> false:
        */

    /*
    public static String sameLetters(String word){
        char [] oneArr = one.toCharArray();
         char [] twoArr = two.toCharArray();
        boolean isSame = false;
        //sort the character in order
        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
        if( Arrays.equals(oneArr,twoArr)){
        isSame = true}
        else {
        isSame = false;}
        return isSame;


        System.out.println("is Anagram: "+ Arrays.equals(oneArr,twoArr));

        return isSame;*/








