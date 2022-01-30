package office_hours.practice_9_11;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        String [] arr = {"apple", "tree","shed","marker","pen"};
        for (String each : arr ){
            System.out.println("First character: "+ each.charAt(0));// each substring(0,1)
            System.out.println("last character "+ each.charAt(each.length()-1)); // each.substring(each.length()-1

            System.out.println("==============");
        }

        int [] arrOne = {1,2,3,4};
        int [] arrTwo = {10,20,30};
        int mergedLength = arrOne.length + arrTwo.length;
        int [] merged = Arrays.copyOf(arrOne,mergedLength);
        System.out.println(Arrays.toString(merged));
        int index = arrOne.length;
        for(int num : arrTwo) {
         arrTwo[ index++ ]= num;
            System.out.println(num);
        }
        System.out.println(Arrays.toString(merged));



    }
}
