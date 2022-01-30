package day16_examples;

import java.util.Scanner;

public class LeaseCar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Which carMake you want");
        String carMake = input.nextLine();
        System.out.println("Which "+ carMake +" model do you want");
        String carModel = input.nextLine();
        double leasePrice = 0;
        switch(carMake){
            case "Lexus":

                if (carModel.equals("RX350")){
                    leasePrice = 600;
                }else if (carModel.equals("LC500")){
                    leasePrice = 900;
                } else if (carModel.equals("CT200")){
                    leasePrice = 350;
                }
                break;
            case "Cadillac":
                if (carModel.equals("Escalade")){
                    leasePrice = 2000;
                } else if (carModel.equals("ATS")){
                    leasePrice = 1500;
                }
                break;
            default:
                System.out.println("invalid - we do not have" + carMake);

        }

        if (leasePrice != 0){
            System.out.println("you can lease a "+ carMake +" "+ carModel +" for $ "+ leasePrice );
        } else {
            System.out.println("we don't hane the model "+ carMake);
        }


    }
}
