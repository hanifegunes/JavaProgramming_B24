package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class SumNumbersArray {
    public static void main(String[] args) {
        /*
        Given an ArrayList of numbers in String format, add each digit of each
element and store into a different ArrayList.
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9

         */
        ArrayList<String > list = new ArrayList<>(Arrays.asList("123","34", "514"));
        String [] str = {"123","34", "514"};
        ArrayList<Integer> nums = new ArrayList<>();
        //int sum = 0;
        for(String each : str) {
            int sum = 0;

            for (int i = 0; i < each.length(); i++) {
               sum += Integer.parseInt(""+each.charAt(i));
              // nums.add(sum);


            }nums.add(sum);
        }
        System.out.println(nums);



    }
}
