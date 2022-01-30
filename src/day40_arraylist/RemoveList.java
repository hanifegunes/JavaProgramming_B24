package day40_arraylist;

import java.util.ArrayList;

public class RemoveList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
                list.add("water");
                 list.add("sun");
                list.add("wind");
                 list.add("wood");
        System.out.println(list);
        System.out.println(list.size()-1);// gives size=3
        list.remove(list.size()-1);
        list.remove(0);// removes first index
        System.out.println(list);

        // list remove(2); anytime you use an index that does not exist it will go out of bounds
        System.out.println("---------------");
        ArrayList<Integer> nums = new ArrayList<>();
        nums .add(50);
        nums .add(70);
        nums .add(80);
        System.out.println(nums);
        nums.remove(1);
        int firstRemoved = nums.remove(1);
        System.out.println("first removed element: "+ firstRemoved);// can use removed one again  70
        System.out.println(nums);
        // adding the removed element back into the arraylist
        nums.add(firstRemoved);
        System.out.println(nums);
        System.out.println("============");
        nums.clear();// makes an empty array list
        System.out.println(nums);
        System.out.println(nums.isEmpty());// checks if there is no elements




    }
}
