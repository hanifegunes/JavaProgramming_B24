package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.addAll(Arrays.asList(3,5,1,2,5));
        ArrayList<Integer> other = new ArrayList(Arrays.asList(10,20));
       // nums.add(other.get(0)); manually add
       // nums.add(other.get(1));

        nums.addAll(other);
        System.out.println(nums);

        nums.addAll(0,other);// 10-20-and others== starting point is index 0;
        System.out.println(nums);



        System.out.println("============");
        System.out.println(other);
       // Integer  five = 5;
       // nums.remove(five); we can not make this, it thinks to remove index 5 not number 5
        nums.removeAll(Arrays.asList(5,10));// removes all 5 's and 10


        System.out.println(nums);

        System.out.println(nums.removeAll(Arrays.asList(30)));//false




    }
}
