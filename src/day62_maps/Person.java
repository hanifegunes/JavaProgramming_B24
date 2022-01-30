package day62_maps;

public class Person {
     String name;
     int age;
     String favoriteNumber;


   public  Person (String name){
        this.name = name;
   }


     @Override
     public String toString() {
          return " [" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  ", favoriteNumber='" + favoriteNumber + '\'' +
                  '}';
     }
}

