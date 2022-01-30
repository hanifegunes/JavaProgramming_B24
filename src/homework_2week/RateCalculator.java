package homework_2week;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {
       Scanner input =new  Scanner(System.in);
        System.out.println("Enter a salary: ");
        double salary = input.nextDouble();
       int weeklyHour = 35;
       double hourRate = salary/ (weeklyHour*52);
        System.out.println("Hourly rate of the employee: $" +hourRate);





    }
}
