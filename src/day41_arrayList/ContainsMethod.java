package day41_arrayList;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        System.out.println(nums);
        System.out.println("=======");
        System.out.println(nums.contains(100));// true
        System.out.println(nums.contains(600)); //false




    }
}
