package day15_switch;

import java.util.Scanner;

public class NestedExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("Enter a score");
        int score = input.nextInt();
        if (score > 75) {
            System.out.println(" good score");

            if (score >= 90) {
            System.out.println("you get 5 stars");
        }   else if (score >= 80) {
            System.out.println("you get 4 stars");
        }   else {
            System.out.println("you get 3 stars");
        }}
        else {
            System.out.println("good try");}
            if (score >= 60){
                System.out.println("get 1 star" );
        }
            if (score <= 50){
                System.out.println(" re take");}

          else {
                System.out.println("re take twice");

            }






}
}*/
        System.out.println("Enter a score");
        int score = input.nextInt();

        if (score >= 75) {

            System.out.println("Good score, keep working hard");

            if (score >= 90) {
                System.out.println("You get 5 gold stars");
            } else if (score >= 80) {
                System.out.println("You get 4 gold stars");
            } else {
                System.out.println("You get 3 gold stars");
            }

        } else {

            System.out.println("Good try");

            if (score >= 60) {
                System.out.println("You get 1 star");
            }

            if (score >= 50) {
                System.out.println("You should retake it");
            } else {
                System.out.println("Retake it twice");
            }

        }


    }
}


