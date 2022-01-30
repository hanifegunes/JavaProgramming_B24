package day19_string_examples;

import java.util.Scanner;

public class FixNameChaining {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter first name");
            String firstName = input.next();
            System.out.println("Enter last name");
            String lastName = input.next();

            String fixedFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String fixedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(fixedFirstName +" "+ fixedLastName);

    }
}
