package homework_3If;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        if (age <1 ){
            System.out.println("Infant");
        }else if (3 <= age &&  age <=  5){
            System.out.println("Toddler");}
        else if (6 <= age &&  age <=  9){
            System.out.println("Kid");}
        else if (10 <= age &&  age <=  12){
            System.out.println("Pre teen");}
        else if (13 <= age &&  age <=  17){
            System.out.println("teenager");}
        else if (18 <= age &&  age <=  20){
            System.out.println("Young Adult");}
        else if (21 <= age &&  age <=  35){
            System.out.println("Adult");}
        else if (36 <= age &&  age <=  55){
            System.out.println("Middle aged adult");}
        else if (55 <= age ){
            System.out.println("Senior Citizen ");}
        else if (120<age  || age <0 ){
            System.out.println(" invalid entry");
        }










    }
}
