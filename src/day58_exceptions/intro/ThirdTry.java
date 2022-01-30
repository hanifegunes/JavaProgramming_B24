package day58_exceptions.intro;

import java.util.Scanner;

public class ThirdTry {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String name = "";
      try{
           name = input.next();
          System.out.println("Pick a character undex");
          System.out.println(name.charAt(input.nextInt()));

      }catch (StringIndexOutOfBoundsException e){
          System.out.println("That is invalid number,try again");
          System.out.println(name.charAt(input.nextInt()));


      }
      finally {
          System.out.println("CLOSING STORE");
          input.close();
      }




    }
}
