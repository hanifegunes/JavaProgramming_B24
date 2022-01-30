package extraRepeatExamples;

import java.util.Scanner;

public class BankAtm {
    public static void main(String[] args) {

      /* int n =5;
       do{

           System.out.println("hello");
           n++;
       }while (n < 10);//; is for to stop the more running while(false) it will stop ..so write the false condition

*/
        Scanner input = new Scanner(System.in);
        int validpin = 1234;
        int userPin;
        int attempts = 0;
        do {
            System.out.println("Enter your pin");
           userPin = input.nextInt();
           attempts++;

        } while(attempts < 3 && userPin != validpin);{
           if(userPin == validpin){
               System.out.println("welcome");
           }else {
               System.out.println("locked");
           }

        }
         while (userPin == validpin){
             System.out.println("welcome");
             break;
         }

    }
}
