package homework_4string.loops;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{

            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();



            shoppingListReport +="Item"+count+": "+item+" Price: "+price+", ";
            totalPrice += price;
            count++;

            System.out.println("Add one more item?");
            countinue = scan.next();



        }while(countinue.equals("yes") && count <= 10);{


            count++;
            shoppingListReport=shoppingListReport.trim(); shoppingListReport.substring(0,shoppingListReport.length()-1);
            System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-1));
            System.out.println("Total price: "+ totalPrice);



        }
        while (countinue.equals("no"));{
            System.out.println(shoppingListReport);

            System.out.println("Total price: "+ totalPrice);


        }
    }
}


