package day10_scanner;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item1,item2,item3, report =" ";
        double price1, price2,  price3,totalPrice = 0;

        System.out.println("Enter item1 and it's price:");
        item1 = input.nextLine();
        price1 = input.nextDouble();
        totalPrice += price1;
        report += "item1  " + item1+ " it's price: "+ price1+", "; //

        input.nextLine();

        System.out.println("Enter item2 and it's price:");
        item2 = input.nextLine();
        price2 = input.nextDouble();
        totalPrice += price2;
        report += "item2  " + item2+ " it's price: "+", " + price2;

        input.nextLine();

        System.out.println("Enter item3 and it's price:");
        item3 = input.nextLine();
        price3 = input.nextDouble();
        totalPrice += price3;
        report += "item3  " + item3 +" price , " + price3;

        input.nextLine();


        System.out.println(report);
        System.out.println("total price "+ totalPrice);

       // double totalPrice = price1+price2+price3; first we learnt but now we can use += to first price





    }
}
