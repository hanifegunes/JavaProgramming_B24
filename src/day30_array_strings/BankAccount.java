package day30_array_strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        /*
        String array
        0- first name
        1- account number
        2- balance
        3- account type

         */
        Scanner input = new Scanner(System.in);
        String [] accountIdm = {"first name", "account number","balance", "account type" };
        String [] accountIdOne = {"James", "303999114","$99040.43", "Checking" };

        System.out.println("first account: "+ Arrays.toString(accountIdOne));

        String [] bankAccountTwo = new String[4];// 4 elements
        bankAccountTwo[3] = "Savings";
        bankAccountTwo[2]= "1335642.44";
        bankAccountTwo[1] = "30101441";
        bankAccountTwo[0]= "James";
        System.out.println("second account; "+Arrays.toString(bankAccountTwo));


      // String [] arr = new String [] { "one", "two",}; valid

        String [] accountThree  = new String[4];
        System.out.println("Enter the name: ");
        accountThree [0]= input.next();
        System.out.println("Enter account number");
        accountThree [1] = input.next();
        System.out.println("Enter balance");
        accountThree [2] = input.next();
        System.out.println("Enter the account type") ;
        accountThree [3] = input.next();
        System.out.println("third account: "+Arrays.toString(accountThree));

        String [] accountFour = new String[4];
        String[] questions = {"first name", "account number","balance", "account type"};


        for(int i = 0; i< accountFour.length; i++){
            System.out.println("Enter "+questions[i]);
            accountFour[i] = input.next();

        }
        System.out.println("Fourth account: " + Arrays.toString(accountFour));










    }
}
