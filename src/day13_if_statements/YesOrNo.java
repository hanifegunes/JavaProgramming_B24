package day13_if_statements;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = input.nextLine();
        System.out.println("do you like soccer");
        String likeSoccer = input.nextLine();

        if (likeSoccer.equals("yes") || likeSoccer.equals("Yes") || likeSoccer.equals("YES") ){
            System.out.println(firstName+" who is your favorite team");

            String team = input.next();
            System.out.println("I like that team too");

        } else if(likeSoccer.equals("no")) {
            System.out.println("thats ok");



        }
        else {
            System.out.println("you didn't answer the question");
        }



    }
}
