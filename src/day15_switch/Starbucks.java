package day15_switch;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
     /*  coffee
     tall, grande,venti
     price,
     calories

      */
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to starbucks");
        System.out.println("which size do you want");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;

        switch (size){
            case "tall":
                price = 3.50;
                calories = 100;
                break;
            case "grande":
                price = 4.50;
                calories = 150;
                break;
            case "venti":
                price = 6.50;
                calories = 200;
                break;
            default:
                System.out.println("we don't serve that size");
                validOrder = false;

        }

        if (validOrder) {
            System.out.println("your order is  " + size);
            System.out.println("your order is  " + price);
            System.out.println("your order is  " + calories);
        }



    }
}
