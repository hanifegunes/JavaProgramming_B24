package OfficeHomework;

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" enter house type");
        String houseType = input.next();
        String  result = "";
        String treeHouse,mobileHome,apartment,villa,townHouse, mansion;



        switch (houseType){
            case "treehouse":
                result = "1";
                break;
            case "mobileHome":
                result = "2";
                break;
            case "apartment":
                result = "4";
                break;
            case "Town house":
                result = "6";
                break;
            case "mansion":
                result = "10";
                break;
            case "villa":
                result ="8";
                break;


            default:
                System.out.println("not valid");}
        System.out.println(houseType +"\n"+ result);







    }
}
