package homework_3If;

import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {


        System.out.println("Select screen size:");

            Scanner input = new Scanner(System.in);
            double screenSize = input.nextDouble();
            double price = 0;
            if (screenSize ==13.3 ){
                price += 200;
            }
            else if (screenSize ==15.0 ){
                price += 300;
                System.out.println(price);
            } else if (screenSize ==17.3 ){
                price += 400;
            }
            System.out.println("Select CPU type:");
             String cpu = input.next();
             if  (cpu.equals("i3")){
                price += 150;}
              else   if  (cpu.equals("i5")){
                price += 250;}
                else if  (cpu.equals("i3")){
                     price += 350;}

            System.out.println("Select RAM size:");
        int ramSize = input.nextInt();
        price +=  (ramSize/4)* 50;

            System.out.println("Select storage type:");
            String storageType = input.next();
            if (storageType.equals("HDD"))  {
                price += 0;
            }
           else if ( storageType.equals("SSD")) {
                price+= 100;
            }
        System.out.println("Enter memory size:");
           int memorySize = input.nextInt();
           if (memorySize == 500){
               price +=50;
           }if (memorySize == 1000){
            price += 100;}

            System.out.println("Enter screen resolution:");
            String screenResolation = input.next();
            if (screenResolation.equals("FULLHD")){
                price +=100;

            }
            else if (screenResolation.equals("4K")) {
                price += 200;


            }

        System.out.println("Laptop price is: $"+ price );
            }}

