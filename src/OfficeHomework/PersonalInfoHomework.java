package OfficeHomework;

import java.util.Scanner;

public class PersonalInfoHomework {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("how many people they live with?");
        int peopleNum = input.nextInt();
        if (peopleNum>3 || peopleNum<6){
            System.out.println("Live with 3 -6 people");
        }else if (peopleNum >6){
            System.out.println("more than 6 people");

        }
        System.out.println("what city they live in?");
        String city  = input.next();
        System.out.println(" live in downtown ");
       String downTown = input.next();
        System.out.println("have you thought about moving to the suburbs?");
        if (downTown.equals("yes")) {
            System.out.println("do it its great");

        }else if (downTown.equals("no")){
            System.out.println("you should think about it");
        }

        System.out.println(" favorite animal?");
        String animal = input.next();
        System.out.println("Wow " + animal +" is a great animal");
        System.out.println("how many pets they want?");
        int pet = input.nextInt();
        System.out.println("Interesting, do you want "+ pet+ "favoriteAnimals?");








    }

}
