package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer ,String > map1 = new HashMap<>();  // not really ordered, might be seen but not everytime
        map1.put(1, "two");
         map1.put(2,"four");
         map1.put(1,"one");
         map1.put(5,"five");
         map1.put(3,"three");
        System.out.println("Hashmap " + map1);


        Map<Integer ,String > map2 = new LinkedHashMap<>();  //first entry is the 1. element,in LinkedHashMap
        map2.put(1, "two");
        map2.put(2,"four");
        map2.put(1,"one");
        map2.put(5,"five");
        map2.put(3,"three");
        System.out.println("Linked hashmap : "+map2);

        Map<Integer ,String > map3 = new TreeMap<>();  // garanteed sorted
        map3.put(1, "two");
        map3.put(2,"four");
        map3.put(1,"one");
        map3.put(5,"five");
        map3.put(3,"three");
        System.out.println("treemap "+ map3);

        Map<String, String>map4 = new HashMap<>();
        map4.put("apple", "juice");
        map4.put("water", " pool");
        map4.put("computer", "chip");
        map4.put("Zebra", "Zoo");
        map4.put("Class", "java");
        map4.put(null, "empty");

        Map<String, String>map5 = new TreeMap<>();// not allow null key
        map5.put("apple", "juice");
        map5.put("water", " pool");
        map5.put("computer", "chip");
        map5.put("Zebra", "Zoo");
        map5.put("Class", "java");
       //  map5.put(null, "empty") ;  it is not allowed , not sorted


        Map<String, String>map6 = new LinkedHashMap<>();
        map6.put("apple", "juice");
        map6.put("water", " pool");
        map6.put("computer", "chip");
        map6.put("Zebra", "Zoo");
        map6.put("Class", "java");
        map6.put(null, "empty");  // it is allowed, can be printed

        System.out.println("String Keyed HashMap: "+ map4);
        System.out.println("String Keyed TreeMap: "+ map5);  //sorted-> capital , lower
        System.out.println("String Keyed LinkedHashMap: "+ map6);


    }
}
