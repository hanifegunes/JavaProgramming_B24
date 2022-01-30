package homework_4string.replit;

import java.util.Scanner;

public class JavaPhyton {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scan.nextLine();
        int countJ = 0;
        int countP = 0;
        for (int i =0; i<sentence.length()-3; i++){
            if(sentence.substring(i,i+4).equals("java")){
                countJ++;

            }} for (int i =0; i<sentence.length()-6; i++){

            if (sentence.substring(i,i+6).equals("python")){
                countP++;
            }} if (countJ == countP){
            System.out.println("true");
        } else   {


            System.out.println("false");


        }






    }
}
