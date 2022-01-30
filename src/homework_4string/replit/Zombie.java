package homework_4string.replit;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter population");
        int inhabitants = scan.nextInt();
        System.out.println("enter day");
        int day =scan.nextInt();

        String result = "";
        if(inhabitants == 0){
            System.out.println("---- EXTINCT ----");}
        else {
            while(inhabitants != 0);{
                System.out.println("Day "+day+"["+inhabitants+"]");
                inhabitants = inhabitants/(day+1);
                day++;
                System.out.println("Day "+day+"["+inhabitants+"]");

            }}













    }
}
