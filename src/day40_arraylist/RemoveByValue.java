package day40_arraylist;

import java.util.ArrayList;

public class RemoveByValue {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("mouse");//removes the first"mouse"
        list.add("marker");
        System.out.println(list);
        list.remove("mouse");//
        System.out.println(list);
        System.out.println("==============");
        boolean removed = list.remove("mouse"); // removes the first "mouse"
        System.out.println(removed +"-");// turns to boolean == if you sout the removed , it will return to boolean--true or false
        System.out.println(list);

        boolean removed2 = list.remove("hat");
        System.out.println(removed2);
        System.out.println(list);


    }
}
