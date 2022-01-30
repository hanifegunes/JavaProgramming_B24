package day62_maps;

import java.util.HashMap;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        HashMap<String , Double> inventory = new HashMap<>();
        inventory.put("Water", 1.50);
        inventory.put("Fruits", 2.99 );
        inventory.put("Coffee", 2.99);
        inventory.put("Bread", 0.99);

        System.out.println(inventory);
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy");
        String item = input.next();

        if(inventory.containsKey(item)){
            System.out.println("it is in stock");
            System.out.println(item + " cost "+ inventory.get(item));
        }   else {
            System.out.println(item + " is not in stock");
        }


    }
}
