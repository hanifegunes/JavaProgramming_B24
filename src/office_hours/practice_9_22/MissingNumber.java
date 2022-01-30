package office_hours.practice_9_22;

import java.util.Arrays;

public class MissingNumber {
    /*
    get an array of numbers from 1 to 9
    [1,2,4,5,6,7,8,9]

    find the missing number


     */
    public static void main(String[] args) {
        System.out.println(findMissingNumber(5,4,6,9,1,2,3,8));
    }





    public static int findMissingNumber(int ... nums) {// int [] nums = than i should give them in main but with args i can give them  in the main inside
        Arrays.sort(nums);
        int checking = 1;
        for (int each : nums) {
            if (checking != each) { //if(checking++ != each)
                break;    // return  checking;
            }
            checking++; // update checking number every iteration
        }

        return checking;

    }

}
