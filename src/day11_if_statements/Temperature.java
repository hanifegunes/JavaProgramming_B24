package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int temp= 60;
        System.out.println("enter the temperature");
        int temp1 = input.nextInt();
    if (temp1 >= 70){
        System.out.println(" it is a nice day");
    }
    else{
        System.out.println("it is cold,study java :)");
    }


    }
}
