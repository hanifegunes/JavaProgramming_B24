package homework_4string;

import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {

        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        int zipcode =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        int age = 0;
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasLicence = "";
        hasLicence = scan.next();
        if (hasLicence.equalsIgnoreCase("no")) {


            System.out.println("Invalid data!");}

           else if (hasLicence.equalsIgnoreCase("yes")) {
                System.out.println("what is your zipcode");
                zipcode = scan.nextInt();
                if (zipcode == 20910 || zipcode == 20740) {
                    premium += 30;
                } else {
                    premium += 50;
                }
                System.out.println("Is this vehicle Owned, Financed, or Leased?");
                vehicleOwnership = scan.next();

                if (vehicleOwnership.equalsIgnoreCase("yes")) {
                    premium += 10;
                } else {
                    premium += 20;
                }
                System.out.println("How is this vehicle primarily used?");
                vehicleUsage = scan.next();
                if (vehicleUsage.equalsIgnoreCase("business")) {
                    premium += 50;
                } else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
                    premium += 10;
                } else if (vehicleUsage.equalsIgnoreCase("commute")) {
                    premium += 20;
                }
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += 5 * daysDrivenToWorkOrSchool;
            }
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            if (milesToWorkOrSchool > 0) {
                premium += milesToWorkOrSchool * 1;
            }

            System.out.println("How old are you?");
            age = scan.nextInt();
            if (age < 16) {
                System.out.println("Invalid data!");
                if (age > 16 && age < 18) {
                    premium *= 20;

                } else if (age > 18 && age < 21) {
                    premium *= 6;
                } else if (age > 21 && age < 25) {
                    premium *= 2;
                }
                System.out.println("How many years you've been driving?");
                int expr = scan.nextInt();
                if (expr > 0 || (age - expr) >= 16) {
                    premium -= expr * 5;

                }


            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = scan.next();
            if (accidents.equalsIgnoreCase("yes")) {
                System.out.println("How many?");

                accidentsAmount = scan.nextInt();

                premium += accidentsAmount * (premium * 0.2);

            } else if (accidents.equalsIgnoreCase("no")) {
                System.out.println("ok");
            }
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();

            if (continuousInsurance.equalsIgnoreCase("no")) {
                premium *= 2;
            }
            System.out.println("What is the highest level of education you have completed?");
            education = scan.next();
            if (education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
                premium -= (premium * 0.05);

            } else if (education.equalsIgnoreCase("Doctors")) {
                premium -= (premium * 0.1);
            } else if (education.equalsIgnoreCase("Less than High School")) {
                premium += (premium * 0.05);
            }
        /*The display message: "Start Your Policy Today For: $premium". Instead of premium, your program should print premium's variable value.
Then display message with reference number: "Reference number: referenceNumber". In order to build reference number variable (referenceNumber), concatenate first 2 letters of customer's name, age, last 2 letters of of customer's name, zip code, and level of education without spaces. This value should be all upper case!


         */
        }


        referenceNumber += name.substring(0, 2).toUpperCase() + age + name.substring(name.length() - 2).toUpperCase() + zipcode + education.toUpperCase().replaceAll(" ", "");
     System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+referenceNumber);









    }}






























