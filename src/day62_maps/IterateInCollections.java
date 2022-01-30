package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateInCollections {
    public static void main(String[] args) {


        ArrayList<String>list = new ArrayList<>(Arrays.asList("James","Adem","Anna","Beth"));

        Iterator<String> it = list.iterator();
      //  System.out.println(it.next());
      //  System.out.println(it.next());


      //  while (it.hasNext()){
      //      System.out.println(it.next());
      //  }
       // System.out.println(it.next());
        System.out.println("==============");

        while (it.hasNext()){
           String name = it.next();
           if(name.startsWith("A")){
               it.remove();
           }
       }
        System.out.println(list);

    }
}
