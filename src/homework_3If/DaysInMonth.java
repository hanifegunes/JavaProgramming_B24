package homework_3If;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("How many days in it?");

         Scanner input = new Scanner(System.in);

        int day = input.nextInt();
        int January31 ,February28,March31,April30,May31,June30,July31,August31,September30,October31,November30,December31;
        January31= 1;
        February28= 2;
        March31=3;
        April30=4;
        May31=5;
        June30=6;
        July31=7;
        August31=8;
        September30=9;
        October31=10;
        November30= 11;
        December31=12;


        if ( day == 31  ){
            System.out.println("31 days: "+ January31 +","+March31 +","+May31+ ","+July31+","+August31+","+October31+","
            +December31);
        } else if (day == 30){
            System.out.println("30 days: "+ April30 +","+June30+","+September30+","+November30);}

        else if (day == 28){
            System.out.println("28 days:" + February28);
        }
        else System.out.println("not valid");







    }
}
