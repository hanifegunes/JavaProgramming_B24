package day10_scanner;
import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work a week? ");
        int weeklyHours = input.nextInt();

        double hourlyRate = salary/(weeklyHours *52);
        System.out.println("With a salary of  "+ salary + " your hourly rate for "+ weeklyHours + " hours a week is  "+ hourlyRate);




    }
}
