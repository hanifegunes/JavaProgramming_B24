package day15_switch;

import java.util.Scanner;

public class DaysInWeek2 {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("what is day number");
        int dayNum = input.nextInt();
        boolean isDay = true;
        int num = input.nextInt();
        String dayName = " ";

        switch (dayNum){
            case  1 :
                dayName = ("monday");

            case  2 :

                dayName =("tuesday");
                break;
            case 3 :

                dayName =("wednesday");
                break;
            case 4 :

                dayName =("thursday");
                break;
            case  5 :

                dayName =("friday");
                break;
            case  6 :

                SdayName =("saturday");
                break;
            case  7 :

         dayName =("sunday");
                break;
            default:
                System.out.println("invalid day");

                isDay = false;



        }


    }
}

        */
        Scanner input = new Scanner(System.in);
        System.out.println("what is day number");


        int daysInWeek = input.nextInt();
        String dayName = " ";
        boolean outOfRnage = true;

        switch (daysInWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                outOfRnage = false;

                System.out.println("invalid day numbers!");


        }
        if (outOfRnage == true ) {
            System.out.println("Days in a week = " + dayName);
        }}}