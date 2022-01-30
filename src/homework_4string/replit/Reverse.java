package homework_4string.replit;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String reverse = "";


        if (word.length() < 5 ){
            System.out.println("Too short!");}

        else if(word.length()> 5){

            System.out.println("Too long!");}


       else  if(word.length() == 5){
          //  word =  word.substring(word.length()-1,word.length()-2)+word.substring(word.length()-2,word.length()-3)//+word.substring(word.length()-3,word.length()-4)+word.substring(word.length()-4,word.length()-5);
          //  System.out.println(word);
            reverse =""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
            System.out.println(reverse);
        }





    }
}
