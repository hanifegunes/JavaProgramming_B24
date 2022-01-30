package homework_4string;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        String address1 = "30 eagle dr.";
        System.out.println(address1.isEmpty());// true== no space

        String s4 = "";
        System.out.println(s4.length());
        System.out.println(s4.isEmpty());// false ,




        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine();
        if(address.isEmpty()){
            System.out.println("No address found");
        }
        address = address.toUpperCase();
        System.out.println(address);


    }
}
