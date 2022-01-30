package homework_3If;

import java.util.Scanner;

public class SmallTask1 {
    public static void main(String[] args) {
        System.out.println("enter a number for y");
        Scanner input = new Scanner(System.in);
      int y = input.nextInt();
      int x = 5;





      if(y ==20) {
          System.out.println( "x"+ "=" +x);


      }else {
          System.out.println("false");
      }
        System.out.println("what is the temperature?");

      int temp = input.nextInt();
      if(70 <= temp  && temp <= 80) System.out.println("ideal temp");
        System.out.println("what is b?");
      int a = 20;
      int b  = input.nextInt();
        System.out.println("what is c?");
        int c  = input.nextInt();
      if (b == 50 && c >= 100){
          System.out.println("a" +"=" + a);}
      else
          System.out.println("false");

      if(true) System.out.println("false");

      if(false)   System.out.println("true");















    }
}
