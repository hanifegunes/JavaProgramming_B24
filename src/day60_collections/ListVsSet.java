package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSet {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(null);
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        System.out.println(set);

       // set.get(0);   hashset is unordered so no index- can not reach individually, for each works
        for (String each : set) {
            System.out.println(each);

        }

        HashSet<String> set2 =   new HashSet<>(list); // converts the list to set type.no dups,
        System.out.println(set2);
        ArrayList<String> set3 = new ArrayList<>(set);
        System.out.println(set3);

    }





}
