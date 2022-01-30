package day39_wrapper_arrayList;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        /*
        Task:
create a new class called CountCharacters

    Ask the user to enter their email

    count how many uppercase letter
    count how many lowercase letters
    count how many numbers
    count all other character

    Challenge: instead of making 4 counting variables, use 1 array
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your email");
        String email = input.next();
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countOther = 0;

        for(char each : email.toCharArray()){ // toCharArray method gives the char[]
            if(Character.isUpperCase(each)){
                countUpper++;
            }else if(Character.isLowerCase(each)){
                countLower++;

            }else if (Character.isDigit(each)){
                countDigit++;

            } else {
                countOther++;
            }


        }
        System.out.println("uppercase letters: "+ countUpper );
        System.out.println("lowercase letters: "+ countLower);
        System.out.println("digit characters: "+ countDigit);
        System.out.println("other: "+ countOther);

    }
}
