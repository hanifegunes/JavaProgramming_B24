package OfficeHomework;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Salary ");
        System.out.println("Enter your hourly rate");
        double hourlyRate;
        int weeklyHours,numWeeks;
        hourlyRate = input.nextDouble();
        if(hourlyRate>0  ){

        }else {
            System.out.println("Hourly Rate cannot be Negative or Zero");

        }System.out.println("enter your weekly hours");
        weeklyHours = input.nextInt();


        if (weeklyHours>1 && weeklyHours < 52){

        }else {
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65-number of weeks cannot be less than 1 and more than 52 ");
        }if( hourlyRate< 0 &&  weeklyHours<1 && weeklyHours> 52){
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");
        }
        System.out.println("enter number of weeks");
        numWeeks = input.nextInt();

        double salary = hourlyRate*weeklyHours* numWeeks ;
        System.out.println(salary);

        }




}
