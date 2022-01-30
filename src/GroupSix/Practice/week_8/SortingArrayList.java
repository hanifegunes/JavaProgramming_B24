package GroupSix.Practice.week_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArrayList {
     //   ArrayList -- sorting in ascending

    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(4,8,3,15,5)) ;
        System.out.println(ascending(liste));
        System.out.println(descending(liste));
    }




 public  static String  ascending(ArrayList<Integer> list){
     int  ascOrder = 0;
          for(int i = 0; i< list.size(); i++){

              for(int j = list.size()-1; j> i; j --){
               if( list.get(i)> list.get(j)){
                   ascOrder = list.get(i);
                   list.set(i,list.get(j));
                   list.set(j,ascOrder) ;
               }
              }

          }return " "+ list;


 }
 //  ArrayList -- sorting in descending order
    public  static String descending(ArrayList<Integer> list){
      int decOrder =0;
         for(int i = 0; i< list.size(); i++){

              for(int j = i+1; j< list.size(); j ++){
                  if( list.get(i) < list.get(j)){
                     decOrder= list.get(i);
                      list.set(i,list.get(j));
                      list.set(j,decOrder) ;

                  }

              }
         }
            return  ""+list;

    }

    public static void SortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

    }

    public static void SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

    }

}
    /*
   1 . ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.

2. ArrayList -- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method



    
     */