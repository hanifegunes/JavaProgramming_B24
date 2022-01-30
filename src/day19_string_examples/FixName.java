package day19_string_examples;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first name");
            String firstName = input.next();
            System.out.println("Enter last name");
            String lastName = input.next();

        String firstNameFirstLetter = firstName.substring(0,1);// 1 not included
        String lastNameFirstLetter = lastName.substring(0,1);

        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        lastNameFirstLetter =lastNameFirstLetter.toUpperCase();
        String remainingFirstName = firstName.substring(1);
        String remainingLastName = lastName.substring(1);

        remainingFirstName = remainingLastName.toLowerCase();
        remainingLastName = remainingFirstName.toLowerCase();


        System.out.println(firstNameFirstLetter+remainingFirstName+" "+lastNameFirstLetter+remainingLastName);




    }
}
