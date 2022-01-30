package day15_switch;

import java.util.Scanner;

public class DaysInMonth2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which month?");
        boolean isDay = true;
        int daysIn = input.nextInt();
        int num;
        switch (daysIn){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("31");
              break;
            case 2:

                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("30");
            break;
            default:
                System.out.println("nat valid");
                isDay = false;


        }



    }
}
