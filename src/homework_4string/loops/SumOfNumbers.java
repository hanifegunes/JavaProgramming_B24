package homework_4string.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
       int  count = 0;
        boolean positiveNumber = true;


        while (positiveNumber && count <=5){
            System.out.println("Enter a number");
            int number = input.nextInt();
            count++;
            // sum += number;// sum = sum+number

            if (number<0 ){
                positiveNumber = false;
            }else {
                sum += number;

            }

        }
        System.out.println("sum "+ sum);
    }
}
