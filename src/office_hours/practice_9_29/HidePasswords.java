package office_hours.practice_9_29;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePasswords {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        System.out.println(hidePassword(list));
        System.out.println(convertToStars("one"));


    }

        /*
        Given an array of passwords (String).
         Hide each password as a star (*) and show the hidden password
         Ex:Input:
        {"one",  "hi", "hold}
         Output: [ ***, **, **** ]
         */
          public static ArrayList<String> hidePassword (ArrayList<String> list) {
              String[] password = {"one", "hi", "hold" };

              for (int i = 0; i< list.size(); i++) {

                  String  stars =convertToStars(list.get(i));

                 list.set(i,stars);

              }return list;
          }
          public  static  String convertToStars(String str){
          // one -> ***
          String stars = "";
          for(int i = 0; i < str.length(); i++){
              stars += "*";
          }

             return stars;
          }


}
