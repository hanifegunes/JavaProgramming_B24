package day39_wrapper_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
       // adding - assigning value to array:  arr[index] =value
        numbers.add(50); // add will put the element to the end
       // print arrays: Arrays.toString(arr)
        System.out.println(numbers);
        numbers.add(-100);
        numbers.add(200);
        System.out.println("-----------");
        System.out.println(numbers.add(400));// add method also return boolean
        System.out.println();
        System.out.println(numbers);
       // find the length of the array: arr.length
        System.out.println(numbers.size()); // array list length
        // reading first element from array arr[0]
        System.out.println("first element :"+ numbers.get(0));
        System.out.println("last index is: "+(numbers.size()-1)); // last index,element




    }
}
