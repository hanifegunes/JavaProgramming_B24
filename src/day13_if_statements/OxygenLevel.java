package day13_if_statements;

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
      /*Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level

Above 90 - Your tank is full
Above 80 - Still okay
Above 70 - Don't go too far
Above 60 - Start to head back
Above 50 - Be careful now you at at 50%


       */
        Scanner input = new Scanner(System.in);
       // int oxygenLevel = 80
        System.out.println("what is the oxygen level");
        int oxygenLevel = input.nextInt();
        String message ="";
        if (oxygenLevel >= 90 ){
            message = "your tank is full";

        }
        else if (oxygenLevel >= 80) {
            message =" still okay";

        }
        else if (oxygenLevel >= 70) {
            message =" don't go too far";}
        else if (oxygenLevel >= 60) {
            message ="start to head back";}
        else if (oxygenLevel >= 50) {
            message ="be careful now you are at 50%";}
        else {
            message ="below 50!";
        }
        System.out.println(message);



    }
}
