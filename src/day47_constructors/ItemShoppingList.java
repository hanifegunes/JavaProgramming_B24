package day47_constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemShoppingList {
    public static void main(String[] args) {
       Item firstItem = new Item("Apples",5,1.33);
        Scanner input = new Scanner(System.in);
        System.out.println(firstItem);
        firstItem.quantity +=5;
        firstItem.calculatePrice();
        System.out.println(firstItem);


        String keepGoing = "yes";

        ArrayList<Item> shoppingList = new ArrayList<>();
        while ((keepGoing.equalsIgnoreCase("yes"))){
            System.out.println("What is the item name?");
            String name = input.nextLine();

            System.out.println("what is the quantity");
            int quantity = input.nextInt();

            System.out.println("what is the unit price");
            double unitPrice = input.nextDouble();

            Item item = new Item(name, quantity, unitPrice);
            shoppingList.add(item);

            System.out.println("do you want to add item");
            input.nextLine();//empty enter input
            keepGoing= input.nextLine();

        }
        System.out.println("Shopping List:");

        System.out.println(shoppingList);



    }
}
