package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {
    /*
    Create a list that accept an arraylist and return an ArrayList of only unique values
     */

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(3,4,1,5,1,1,3,6,10));
        System.out.println(getUniqueElement(list));
    }





    // return type like int  -method name - parameters
    public  static ArrayList<Integer> getUniqueElement(ArrayList<Integer>list){
        ArrayList<Integer> unique = new ArrayList<>();
        for (int each : list){ // no need to use Integer .. auto wrap class will change it
        int count = Collections.frequency(list,each);
        if(count == 1){
            // unique
            unique.add(each);
        }
        }
        return unique;
    }




}
