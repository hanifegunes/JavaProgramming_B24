package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList2 {
    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> list){
        ArrayList<Boolean>list1 =new ArrayList<>();
        for(int i = 0;i<list.size();i++){
           list1.add(list.get(i));

        }

        return list1;

    }






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true,false));
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }





}
