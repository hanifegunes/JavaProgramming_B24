package office_hours.practice_9_29;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    /*
    Given an ArrayList of numbers in String format,
     add each digit of each element and store into a different ArrayList.
      Ex:
      Input:
      “123”,“34”,“513”
      Output:
      [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));


        System.out.println(getSumOfString(list));
    }



      public  static ArrayList<Integer> getSumOfString (ArrayList<String> list ){
          ArrayList<Integer> numbers = new ArrayList<>();

          for(String each : list){
              int sum = 0;

              for(int i = 0; i< each.length(); i++){
                 // sum+= each.charAt(i); gives numbers ascii value
                sum += Integer.parseInt(""+each.charAt(i));// or each.substring(i,i+1)


              }
              numbers.add(sum);
          }
              return numbers;
          //challenge: extract the inner loop make a helper method



      }






}
