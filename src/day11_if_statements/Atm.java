package day11_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to the Atm ***");
        System.out.println( " Please enter your passcode");
        int inputPasscode = input.nextInt();
        int validPasscode = 1234;

        if( inputPasscode == validPasscode) {

            System.out.println("Logged in!");
            System.out.println("Select a number");
            System.out.println("\t1) Check Balance");
            System.out.println("\t2) Deposit");
            System.out.println("\t3) Withdraw");


            int selection = input.nextInt();
            if (selection == 1){
                System.out.println("your balance is $"+ 100000);
            }
            if (selection == 2){
                System.out.println("enter your bills in the slot");
            }

            if (selection == 3){
                System.out.println("take your monet from the dispenser");
            }

        }



        else {
            System.out.println(" invalid passcode");
            System.out.println("Try again");
        }
        System.out.println("thank you");


    }
}
