package OfficeHomework;

import java.util.Scanner;

public class OfficeHourSchedule {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Enter the day");
        String message ="";
        String day;
        day = input.next();
        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday")){
            message ="Office hours at 5:30-6:45 EST";
        } else if (day.equalsIgnoreCase("thursday")){
            message = "Soft skills day";

        }else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")){
            message = "Already a long day, no office hours.";

        }else if(day.equalsIgnoreCase("friday")){
            message = "Day off";
        }



        else {
            message ="valid day given";
        }
        System.out.println(message);


    }}
