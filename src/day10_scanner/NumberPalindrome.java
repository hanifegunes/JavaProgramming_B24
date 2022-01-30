package day10_scanner;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        int num = scan.nextInt();
       // isPalindrome(num);


        //  public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int checkDigit = 1;

        while (num / checkDigit >= 10) {
            checkDigit *= 10;
        }

        boolean result = true;
        while (num != 0) {

            int first = num / checkDigit;
            int last = num % 10;


            if (first != last) {
                result = false;
            }

            num = (num % checkDigit) / 10;

            checkDigit = checkDigit / 100;
        }
        System.out.print(result);

        // }


    }


}
