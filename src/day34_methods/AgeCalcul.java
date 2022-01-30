package day34_methods;

import java.util.Scanner;

public class AgeCalcul {public static void getAge(int year){
    System.out.println("Your age in 2021 is");
    System.out.println(2021 - year);
}


    public static void main(String[] args) {

        getAge(2000);

        getAge(1990);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int yearB = input.nextInt();
        getAge(yearB);



    }




}
