package OfficeHomework;

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter");
        String message = "";
        char letter = input.next().charAt(0);
        if (letter >= 65 && letter <= 90){
            message = "upper case";

        }else if (letter >= 97 && letter <= 122){
            message = "lower case";

        }else {
            message = "invalid";
        }
        System.out.println(message);




    }
}
