package homework_2week;
import java.util.Scanner;

public class PlaceOrder {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("product name ");
        String pName= input.next();

        System.out.println("enter the price: ");
        double price = input.nextDouble();

        System.out.println(" quantity is: ");
        int quantity = input.nextInt();
        System.out.println("your first name: ");
        String firstName = input.next();
        System.out.println("your last name:");
        String lastName = input.next();
        double total = price* quantity;
        System.out.println(" your total is " + "  $"+ total);

        System.out.println(firstName +  " your order for "+ quantity +" " + pName +  " has been placed. your total is " +total +"$");







    }




}
