package day32_array;

import java.util.Scanner;

public class SplitPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // System.out.println("How many words do you want to enter");
       // int size = input.nextInt();


        System.out.println("Enter the 3 words");
        String  str = input.nextLine();
        input.close();
        String [] words = str.split(" ");
        String reverse = "";

        for(int i = words[1].length()-1 ; i >= 0; i--){
            reverse += words[1].charAt(i);

        }
        System.out.println(words[0]+" "+reverse+ " "+ words[2]);






    }
}
