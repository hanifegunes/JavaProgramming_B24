package day28_nested_loop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = input.nextInt();
        /*
        7/2
        7/3
        7/4
        7/5
        7/6
         */

        for (int number  = 2; number <= range; number++ ){
            boolean isPrime = true;
            for  (int j = 2; j<number ; j++ ){
                if (number %j == 0){
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(number+" ");

            }
        }

        System.out.println();
    }
}
