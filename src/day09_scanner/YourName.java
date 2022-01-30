package day09_scanner;
import java.util.Scanner;
public class YourName {
    public static void main(String[] args) {
        /*
        ask the user to enter their  first name
        ask the user to enter their second name
        use next() reads only single name
         */

       Scanner input = new Scanner(System.in) ;
        System.out.println("Enter your first name ");
        String firstName = input.next();


        System.out.println("Enter your last name ");
        String lastName = input.next();

        System.out.println("your full name is "+firstName + " " +lastName);




    }
}
