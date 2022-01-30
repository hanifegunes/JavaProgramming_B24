package day30_array_strings;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter");
        int size = input.nextInt();
        int [] numbers = new int[size];

        for(int i = 0; i< numbers.length; i++){
            System.out.println("Enter a number");
            numbers[i] = input.nextInt();
        }
  //    counter variables
        int even =0;
        int odd = 0;
   // string variables for loop to print

        String evenNum = "";
        String  oddNum = "";
//    for each loop to find even and odd

        for(int eachNum : numbers){
            if(eachNum % 2 == 0){
                even++;
                evenNum += eachNum +" ";
            }else {
                odd++;
                oddNum += eachNum+ " ";
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("even "+ even +" evennumbers "+evenNum +" ");
        System.out.println("odd "+ odd +" odd numbers "+oddNum+" ");

    }
}
