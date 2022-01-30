package day23_loops;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
       /* int n =5;
       do{

           System.out.println("hello");
           n++;
       }while (n < 10);//; is for to stop the more running while(false) it will stop ..so write the false condition

*/
        Scanner input = new Scanner(System.in);
        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {

            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        } while (attempts < 3 && userPin != validPin);

        if (userPin == validPin) {
            System.out.println("Welcome, you are logged in");
        } else {
            System.out.println("LOCKED OUT, TOO MANY ATTEMPTS");
        }
    while(userPin !=validPin);

        System.out.println("Welcome, you are logged in");


}

}