package day12_if_examples;

public class DaysOfWeek {
    public static void main(String[] args) {
      /*1- monday
      2- tuesday
      ....
      7- sunday
      System.out.println("monday");instead of writing sout just result is ok now


       */
        String result = "";
        int day=5;
        if(day == 1){
            result ="Monday";
        } else if (day == 2){
            result ="Tuesday";
        }else if (day ==3){
            result ="Wendesday";
        }else if (day ==4){
            result ="Thursday";
        }else if (day ==5){
            result ="Friday";
        }else if (day ==6){
            result ="Saturday";
        }else if (day ==7){
            result ="Sunday";
        }
        System.out.println(result);




    }
}
