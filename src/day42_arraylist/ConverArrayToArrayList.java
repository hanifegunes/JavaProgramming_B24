package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverArrayToArrayList {
    public static void main(String[] args) {
        Integer [] a = {1,2,3};  // this needs to be Integer( not int ) wrapper class because primitive types does not work

        Arrays.asList(a)  ; // this allows us to convert from the array to the arraylist
          // converting the 'a' to array list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);
        System.out.println("==============");


            // creating an array with values right away
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,1,6,10,102,50,20,40));
        System.out.println(list2.isEmpty());
        System.out.println(list2);



    }

}
