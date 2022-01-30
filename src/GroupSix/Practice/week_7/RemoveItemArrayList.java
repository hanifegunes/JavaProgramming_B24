package GroupSix.Practice.week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveItemArrayList {
    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList(Arrays.asList("Ahmed", "John", "Eric"));
        System.out.println(liste);
         liste.removeIf(word -> word.equals("Ahmed"));
        System.out.println(liste);
        System.out.println(list(liste));
        
       // liste.removeIf(word -> word.equals("Ahmed"));
    }

    public static String list(ArrayList<String> str) {


       // return str.removeIf(word -> word.equals("Ahmed"));, works with boolean


            String result = "";
       for(String each: str){
           if(str.equals("Ahmed")){
           result = ""+str.remove("Ahmed");
           }

       } return result;



      
    }




}


/*
 ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....Write a java operation to remove all the names named Ahmed

 */