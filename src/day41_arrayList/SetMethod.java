package day41_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);
        System.out.println("=======");
        // how do you change a value / element
        // arr[index] = value

        nums.set(0,1000);// remove + add  together== replacing
        nums.set(3,-2000);// removes 900 and adds -2000
        // nums.set(10,10) == out of bounds
        System.out.println(nums.set(1,90));
        //90 changes 90 with 300 and returns the old value ==90
        //  [1000, 300, 700, -2000]


        System.out.println(nums);
        System.out.println(nums.set(1,300));// removes 1st and replace it with 300; returns
        System.out.println(nums);



    }
}
