package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which month is it?");
        int monthNum = input.nextInt();
        boolean isSeason = true;
        switch (monthNum){
            case 1:
            case 2:
            case 12:

                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("not valid");
             isSeason = false;



        }




    }
}
