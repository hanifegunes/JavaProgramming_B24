package day38_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEveryOther {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("5","hi","yo","sup","yolo","book"));
        //for(int i=0; i < size; i++) {
           // list.add(in.next());
        System.out.println(removeEveryOther(list,"yo"));

        //System.out.println(removeEveryOther(list));

    }

    public static ArrayList<String> removeEveryOther(ArrayList<String>list, String str) {

//String remove = str;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(str)) {

                list.remove(i);
            }
        }
        return list;
    }

}
