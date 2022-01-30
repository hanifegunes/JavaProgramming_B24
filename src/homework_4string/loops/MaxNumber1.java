package homework_4string.loops;

import java.util.Scanner;

public class MaxNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int count = 1;
        int max = -245698745;
        int min = 231456456;

        while (count <= 5){
            count++;
            System.out.println("Enter 5 numbers");
            int numbers = input.nextInt();
            if(numbers > max){
               max = numbers;

            }else if (numbers < min){

                System.out.println(numbers);
            }

        }
        System.out.println(max);


    }
}
