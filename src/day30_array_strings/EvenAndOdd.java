package day30_array_strings;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {

        /*

        declare an int array
        count how many even number there is
        count how many odd numbers there is

        print your counters

        challenges:
            traditional for loop
            for each loop

            - not hard code in initial array, but use scanner to get the numbers

     */

       int [] numbers = {4,8,9,3};
        int even =0;
        int odd = 0;
        String evenNum = "";
        String  oddNum = "";

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even++;
                evenNum += numbers[i]+ " ";
            }else {
                odd++;
                oddNum += numbers[i]+ " ";
            }
        }

        for(int eachNum : numbers){
            if(eachNum % 2 == 0){
                even++;
                evenNum += eachNum;
            }else {
                odd++;
                oddNum += eachNum;
            }
        }




        System.out.println(Arrays.toString(numbers));
        System.out.println("even "+ even +" evennumbers "+evenNum);
        System.out.println("odd "+ odd +" odd numbers "+oddNum);





    }
}
