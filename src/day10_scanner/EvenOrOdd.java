package day10_scanner;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        long number = input.nextLong();
        boolean isEven = number %2 ==0;
        boolean isOdd = number % 2 != 0;
        System.out.println( number + " is even: "+ isEven);
        System.out.println( number + " is odd : "+ isOdd);


    }
}
