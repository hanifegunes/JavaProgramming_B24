package office_hours.practice_9_9;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {

        /*

        ask the user to enter last name
              -> all lowercase

        ask the user to enter last name
            -> first letter uppercase, the rest lowercase
            -> first three letter of the first name

       ask the user to enter their favorite number
            -> the number * lastname.length

            email format : last name + . + first name + number + .gmail.com

            store the emails into an array
         */


        Scanner input = new Scanner(System.in);
        System.out.println("how many email do you want to enter ");
        int size = input.nextInt();
        String[] emails = new String[size];

        for(int i = 0; i < emails.length; i++){

        System.out.println("Enter your lastname");

        String lastName = input.next().toLowerCase();

        System.out.println("Enter first name");
        String firstName = input.next().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1,3);
            System.out.println("Enter your favorite number");
         int  favNum = input.nextInt()*lastName.length();
         emails[i] = lastName + "."+firstName+favNum+"@gmail.com";




       }

        System.out.println(Arrays.toString(emails));

    }
}
