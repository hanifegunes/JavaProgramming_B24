package OfficeHomework;

import java.util.Scanner;

public class QualificationForArmy {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Are you a citizen");
        boolean resident = true;


        String citizen = input.next();
        if (citizen.equals("yes") && resident){}
            else{ System.out.println("You must be a U.S. citizen or a resident");}
        System.out.println("how old are you?");
        int age = input.nextInt();
        if (age <35 && age >18) {
            }
        else  {
            System.out.println("your age must be between 18 and 35");}
        System.out.println("have a high school diploma");
        boolean highSchool = input.nextBoolean();
        if(highSchool ){

        }else {
            System.out.println(" must have a high school diploma");}
        if (( citizen.equals("yes") && resident) &&  (age <35 && age >18) && highSchool ){
            System.out.println("you are qualified for the US Army");
        }


        else {System.out.println("you are not qualified");}



        }



}
