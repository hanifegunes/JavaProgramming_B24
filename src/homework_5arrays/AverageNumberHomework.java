package homework_5arrays;

import java.util.Scanner;

public class AverageNumberHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");

        int [] number = new int[input.nextInt()];
        double sum = 0;

        for(int i = 0; i< number.length; i++){
            System.out.println("Enter number "+ (i+1) );
            number[i] = input.nextInt();

            sum += number[i];

           // System.out.println("average number: "+(sum / number.length) );

        }
        System.out.println("average number: "+(sum / number.length) );




    }
}
