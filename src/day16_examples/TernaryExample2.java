package day16_examples;

import java.util.Scanner;

public class TernaryExample2 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println(" Enter the name");
        String itemName = input.nextLine();
        System.out.println("Enter the price "+ itemName);
        double itemPrice = input.nextDouble();
        System.out.println("Do you have prime");
        String hasPrime = input.next();
        // add $5 shipping for not prime
        double finalPrice = hasPrime.equals("yes") || hasPrime.equals("Yes")? itemPrice : itemPrice+5;
        System.out.println("your total price for "+ itemName +" $"+ itemPrice);


    }
}
