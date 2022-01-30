package day12_if_examples;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
      /*"Choose your language"
        int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
                -----> "lets talk in english, hello" /*

       */

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your language. pick the number you want");

        System.out.println("1:English \n2:Spanish \n3:Turkish \n4:Russian \n5:French");

   int selection = input.nextInt();
   String message ="";
   if(selection == 1){
       message = "hello, thank you for your call";}

   else if (selection == 2){
       message = "hola, gracias para llamar";}

   else if (selection == 3){
       message = "merhaba, aradiginiz icin tesekkurler";}

   else if (selection == 4){
       message = "privet, spasibo za vash zvonok";
       }

   else if (selection == 5){
       message = "Merci ,pour votre appel";}
        System.out.println(message);









    }}















