package day15_switch;

import java.util.Scanner;

public class MonthNames {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("what is month name?");
        String monthName = input.next();
        String message = " ";
        int monthNum = 0;
        boolean isMonth = true;

        switch (monthName) {
            case "January":
            case "December":

            case "March":
            case "May":
            case "July":
            case "Agoust":
            case "October":

                monthNum = 31;
                System.out.println(monthNum);

                break;
            case "February":
                monthNum = 28;
                System.out.println(monthNum);
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                monthNum = 30;
                System.out.println(monthNum);
                break;
            default:
                System.out.println("not valid month name");
                isMonth = false;

        }

    }

}//1850
