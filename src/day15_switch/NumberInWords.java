package day15_switch;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your number");
        int numberOfWords = input.nextInt();
        boolean isValid = true;
        boolean isValidData = true;
        switch(numberOfWords){
            case 1:
                numberOfWords = 1;
                System.out.println(numberOfWords + " one ");
                break;
            case 2:
                numberOfWords = 2;
                System.out.println(numberOfWords + " two ");
                break;
            case 3:
                numberOfWords = 3;
                System.out.println(numberOfWords + " three ");
                break;
            case 4:
                numberOfWords = 4;
                System.out.println(numberOfWords + " four ");
                break;
            case 5:
                numberOfWords = 5;
                System.out.println(numberOfWords + " five ");
                break;
            case 6:
                numberOfWords = 6;
                System.out.println(numberOfWords + " six ");
                break;
            case 7:
                numberOfWords = 7;
                System.out.println(numberOfWords + " seven ");
                break;
            case 8:
                numberOfWords = 8;
                System.out.println(numberOfWords + " eight ");
                break;
            case 9:
                numberOfWords = 9;
                System.out.println(numberOfWords + " nine ");
                break;
            case 10:
                numberOfWords = 10;
                System.out.println(numberOfWords + " ten ");
                break;
            default:
                System.out.println("invalid data");
                isValidData = false;



        }



    }
}
