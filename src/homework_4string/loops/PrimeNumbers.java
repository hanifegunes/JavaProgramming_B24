package homework_4string.loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
       // int number = 50;
        int range = input.nextInt();
        boolean isPrime = true;
        for(int number = 2; number < range; number++) {
            if (range % 2 == 0) {
                isPrime = true;
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {


                System.out.println(number);
            }
        }

    }
}
