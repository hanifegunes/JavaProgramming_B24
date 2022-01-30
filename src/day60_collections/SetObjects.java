package day60_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("100");
        obj.add("hello");
        obj.add("%");
        System.out.println("original: "+ obj);


        Set<String>obj2 = new LinkedHashSet<>();
        obj2.add(null);
        obj2.add("hello");
        obj2.add("$4.0");
        obj2.add("100");
        obj2.add("hello");
        obj2.add("%");
        System.out.println("HashSet: "+ obj);

        System.out.println("LinkedHasSet: "+ obj2);
         // obj2.get(); not valid



        Set<String>obj3 = new TreeSet<>();
      //  obj3.add(null); does not allow null
        obj3.add("hello");
        obj3.add("$4.0");
        obj3.add("100");
        obj3.add("hello");
        obj3.add("%");
        obj3.add("World");
        System.out.println("TreeSet : "+ obj3); // no dups., -- no index, sort them automatically












    }




}
