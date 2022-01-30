package day41_arrayList;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);
        System.out.println("=======");
           nums.remove(0); // index of 0
        System.out.println(nums);
       // nums.remove(700) gives error ,primitive now -  because 700 is not an index, it is object
        Integer a = 700; // making an object now --integer type now
        nums.remove(a);// removing object

        nums.remove(new Integer(900));// made object in the remove method
        System.out.println(nums);


    }
}
