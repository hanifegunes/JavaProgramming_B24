package day34_methods;

import java.util.Arrays;

public class AverageMulti {
    public static void main(String[] args) {
        int [][]nums ={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20},

                };
        // add each one and divide . find the average
        double ave1 = (nums[0][1]+nums[0][2]+nums[0][0]+nums[0][3])/4;
        double ave2 = (nums[1][0]+nums[1][1]+nums[1][2])/3;
        double ave3 =(nums[2][0]+nums[2][1]+nums[2][2])/3;
        double ave4 = (ave1+ave2+ave3)/3;
        System.out.println(ave4);
        System.out.println(ave1);
        System.out.println(ave2);
        System.out.println(ave3);
        System.out.println("==============");

        double totalSum = 0;
         double totalNumbers = 0;
        for(int [] eachArray : nums) { // this loop goes thorough the 2d nums array
            //System.out.println(Arrays.toString(eachArray));
            double sum = 0; // putting the variable here means it will be set back to 0 every time my outer loop runs

            for (int eachNum : eachArray) { // this loop goes through the 1d array
             //   System.out.println(eachNum);
                sum += eachNum;

            }
            System.out.println("Average of "+ Arrays.toString(eachArray)+" is "+ (sum/ eachArray.length));
            totalSum += sum;
            totalNumbers += eachArray.length;

        }
        System.out.println("Total average: "+ (totalSum/totalNumbers));
    }
}
