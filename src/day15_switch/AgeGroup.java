package day15_switch;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        //int age =50; hard code
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        if (age >0 && age <120){
            if (age <= 1){
                System.out.println("infant");// else if(age >=2 && age <5) no need now
            }else if(age <= 5){
                System.out.println("toddler");
            }else if (age<= 9){
                System.out.println("kid");
            }else if (age <= 12){
                System.out.println("pre-teen");
            }else if (age <= 17) {
                System.out.println("teen");
            }else if ( age<= 20){
                System.out.println("young adult");
            }else if (age <= 35){
                System.out.println("adult");
            }else if (age <= 55){
                System.out.println("middle aged adult");
            }else {
                System.out.println("senior citizen");
            }




        }else {
            System.out.println("Invalid entry");
        }







    }
}
