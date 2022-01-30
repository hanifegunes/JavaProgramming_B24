package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> countries = new HashMap<>();
         // key is a string - each country;
        // value is an ArrayList of String - each holds all the cities in that country;

        countries.put("North America", new ArrayList<>(Arrays.asList("Chicago","New York","Dallas","Arlington")));
        countries.put("Europe", new ArrayList<>(Arrays.asList("Paris","Rome","Berlin","Lisbon")));
        countries.put("Asia", new ArrayList<>(Arrays.asList("Bangkok","Tokyo","Seul")));
        System.out.println(countries);

        for(String continent: countries.keySet()){
            System.out.println("Cities in: "+ countries.get(continent));
        }
        System.out.println("-------------");

        for(String continent: countries.keySet()){  // goes through the keys which are the continents
            System.out.println("Cities in: "+ continent);

          for(String city: countries.get(continent) ){  // goes through the cities which are each arraylist value

              System.out.println(city.substring(0,1));
          }




        }





    }
}
