package day62_maps;

import java.util.HashMap;

public class MapPractice1 {

    public static void main(String[] args) {

        HashMap< Integer , String > map = new HashMap<>();
          // < key, value >
          //map.add() maps do not have add method, they do not inherit collection interface
         map.put(1, "Leo");
         map.put(2,"Syeda");

        System.out.println(map);

        //how you can read from a map, no index

          //  map.get(2); // this is not index 2, it is key 2;
        System.out.println(map.get(2));
            String name = map.get(2);
        System.out.println(name);
         // no duplicate keys but can have duplicate values
        map.put(1,"Fuat");
        System.out.println(map); // updates key 1 from "Leo" to "Fuat"

    }


}
