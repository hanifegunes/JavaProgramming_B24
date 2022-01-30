package homework_4string.loops;

import java.util.Scanner;

public class Factorial5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        int total = 1;
        int count = 1;

        while (number >  1){

            total = number+total;
            number--;
        }
        System.out.println(total);





    }
}
