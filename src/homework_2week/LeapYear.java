package homework_2week;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in) ;
        System.out.println("ask the user to enter a year: ");
         int year, leapYear;
         year = input.nextInt();
         leapYear = year%4 ;


        System.out.println("year is a leap year:  "+ (leapYear ==0));








    }
}
