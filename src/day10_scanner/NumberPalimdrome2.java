package day10_scanner;

import java.util.Scanner;

public class NumberPalimdrome2 {
    public  static  void  isPalindrome(int num){
       int a =0;// store remainder
        int result = 0; // store result
       int copyNum = num; // need a number to compare with a result, my original number will become 0 inside loop

       boolean isPalindrome = true;

       for(int i = 0; ; i++){
           a = num % 10 ; // 12355 &10 = 5 remainder, is the last digit == 1235%10 = 5-> 123%10 = 3
           result = (result*10)+a;// after first iteration 0+5 = 5
           num = num / 10; // 12355/10=1235 , last digitsiz kalan numaralar da son digit gibi ayrilip sondan basa dizilecekler
           if(num<1){
               break;
           }
       }
        if(copyNum == result){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // System.out.println("enter");
       // int num = scan.nextInt();
        int num = 123;
         isPalindrome(num);

    }

}
