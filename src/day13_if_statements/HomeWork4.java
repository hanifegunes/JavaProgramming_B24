package day13_if_statements;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println("enter the item");
        Scanner input = new Scanner(System.in);
        int blanket,charger,hat,headphone,laptop,pants,pillow,phone,socks,balance,cable;
        String item = input.nextLine();
        blanket = 60;
        charger = 25;
        hat = 25;
        headphone = 30;
        laptop = 1000;
        pants = 50;
        pillow=  40;
        phone = 1000;
        socks = 5;
        cable = 10;
        balance = 100;





        if(item.equals("Blanket") ){
            System.out.println("Thank you for your purchase! Your balance is: "+(balance-blanket)+"$" );
        }
        else if(item.equals("Charger") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-charger)+"$" );
        }else if(item.equals("Hat") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-hat)+"$" );}
        else if(item.equals("Headphones") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-headphone)+"$" );}

        else if(item.equals("Pants") ){

            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-pants)+"$" );}
        else if(item.equals("Pillow") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-pillow)+"$" );}

        else if(item.equals("Socks") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-socks)+"$" );}
        else if(item.equals("USB cable") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-cable)+"$" );}
        else if(item.equals("") ){
            System.out.println("Thank you for your purchase! \nYour balance is: "+(balance-hat)+"$" );}

        else if(item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!" );}
        else if(item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!" );}
        else System.out.println("invalid item!");




    }
}
