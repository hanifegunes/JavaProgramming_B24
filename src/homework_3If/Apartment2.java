package homework_3If;

import java.util.Scanner;

public class Apartment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:
        boolean noBedroom = true;
        switch (numberOfBedrooms){
            case 1:
                startingPrice = 1100;
                System.out.println(numberOfBedrooms+"\nOne Bedroom Selected"+"\nStarting Price: "+startingPrice);
                break;
            case 3:
                startingPrice = 2550;
                System.out.println(numberOfBedrooms+"\nThree Bedroom Selected"+"\nStarting Price: "+startingPrice);
                break;
            case 2:
                startingPrice = 1850;
                System.out.println(numberOfBedrooms+"\nTwo Bedroom Selected"+"\nStarting Price: "+startingPrice);
                break;
            case 5:

                System.out.println(numberOfBedrooms+"\nNo such  Bedrooms available");



        }





    }
}





