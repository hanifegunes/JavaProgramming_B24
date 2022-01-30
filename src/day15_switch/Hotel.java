package day15_switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java hotel");
        System.out.println("how many people in your party");
        int numberOfPeople = input.nextInt();
        System.out.println("how many days will you stay");
        int numOfDays = input.nextInt();
        double price = 0;
        String roomType = "";
        boolean isValidPartySize = true;
        String peopleMessg = " people ";
        String daysMessg = " days ";

        switch (numberOfPeople){
            case 1:
                roomType ="single room";
                price = numberOfPeople *100;
                peopleMessg =" person ";
                daysMessg = " day ";
                break;
            case 2:
                roomType ="double";
               price =  numberOfPeople *125;
               break;
            case 3:
            case 4:
                roomType = "large room";
                price = numberOfPeople*numOfDays*150;
                break;

                // when the value is 3-4 it runs the same code===case3===case4... together
            case 5:
            case  6:
                roomType= "suite";
                price =1000;
                break;
            // when the value is 5 or 6 it runs the same code===case 5===case 6... together
            default:
                System.out.println("party size is too big");
                isValidPartySize =false;


        }
        if(isValidPartySize) {
            System.out.println("okay, great for  " + numberOfPeople +" "+ peopleMessg+ "  staying for " + numOfDays + daysMessg +
                    " your total price is " + price + " for a " + roomType);
        }

    }
}
