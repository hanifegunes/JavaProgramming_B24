package day29_arrays;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        String city1 = "San Fransisco";
        String city2 = "Moscow";
        String city3 = "Madison";
        String city4 = "Tokyo";
        String city5 = "Baghdad";

        String [] cities = { "San Fransisco","Moscow", "Madison", "Tokyo", "Baghdad" };

        System.out.println(cities[0].toUpperCase());
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        System.out.println("------------------------");
        System.out.println(cities.length);// length is how many elements we have==5
        System.out.println("---------------------");
        System.out.println(cities); // no city names,just info== memory,location of the object in the memory

        System.out.println(Arrays.toString(cities)); // gives all elements

        System.out.println(cities[cities.length-1]);// last element 'Bagdad'



    }

}
