package homework_5arrays;

import java.util.Scanner;

public class ShortestAndlongest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to enter");

        String [] words = new String[input.nextInt()];
        int shortest = 1234987;
        int longest = 0;
        String  sword = "";
        String lword = "";
        for(int i = 0; i< words.length; i++){
            System.out.println("Enter word: "+ (i+1));
            words[i] = input.next();

            if(shortest > words[i].length() ){
               shortest = words[i].length();
                sword  = words[i];

            }else if ( longest < words[i].length()){
                longest = words[i].length();
                lword = words[i] ;
            }

        }

        System.out.println("longest "+ lword);
        System.out.println("sortest "+ sword);


    }
}
