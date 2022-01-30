package homework_2week;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double number, divisible;
        number  = input.nextDouble();
        divisible = number%2;

        /*
        int year, leapYear;
         year = input.nextInt();
         leapYear = year%4 ;

         */
       System.out.println("is number divisible "+ (divisible==0));

        divisible = number%3;
        System.out.println("is number divisible "+ (divisible==0));
        divisible = number%5;
        System.out.println("is number divisible "+ (divisible==0));




    }
}
