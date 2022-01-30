package homework_3If;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        int price = 0;
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();

        if( houseType.equalsIgnoreCase("Condo")){
            price += 50000;
        }else if(houseType.equalsIgnoreCase("Townhouse")){
            price += 75000;
        }else if(houseType.equalsIgnoreCase("Single Family Home")){
            price += 95000;
        }


        scan.next();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();

        price += (numberOfBedrooms *30000);
        System.out.println("Do you have a backyard?");
        backyard =scan.nextBoolean();
        if(houseType.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        }
        else if(backyard){
            price +=5000;
        }


        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        System.out.println("How many spots?");

        garageSpots = scan.nextInt();



        if(garageSpots >10) {
            System.out.println("Pardon, it's not public parking!");
        }else if(garage){

            price += (garageSpots * 20000);
        }System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility <= 1){
            price +=10000;
        }else if(metroAccessibility>1 && metroAccessibility <3){
            price += 5000;
        }System.out.println("How close is highway?");
        highwayAccessibility =scan.nextFloat();
        if(highwayAccessibility <= 1){
            price += 15000;
        }else if(highwayAccessibility > 1  && highwayAccessibility < 5){
            price += 8000;
        }else if(highwayAccessibility > 5 && highwayAccessibility < 20){
            price +=4000;
        }System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if(schoolScore> 8 && schoolScore<10){
            price +=45000;
        }else if(schoolScore> 4 && schoolScore<8){
            price+=20000;

        }else {
            price += 5000;
        }System.out.println("Does any of your family members smoke?");
        smoking =scan.nextBoolean();
        if(smoking){
            price -= 5000;
        }



        //else if(houseType.equals("Townhouse")){
        // price += 75000;
        //}else if(houseType.equals("Single Family Home")){
        //  price += 95000;
        //}
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "  + price+"$");








    }
}
