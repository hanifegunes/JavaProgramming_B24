package homework_4string.replit;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name = input.next();
        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();
        int count =0;
        do {
            System.out.println("Please enter guest name:");

            answer = input.next();
            System.out.println("Do you want to enter new guest name:");


        }
            while (answer.equals("yes"));
        {
            answer = input.next();



            name +=","+input.next();

        }


            System.out.println("Guest's list: " + name);





        }}






