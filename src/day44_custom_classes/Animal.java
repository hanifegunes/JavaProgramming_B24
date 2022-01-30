package day44_custom_classes;

public class Animal {

   // instance variable
    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;

     // methods
    // no static means  there are instance methods
    public void eat(){
     // Animal.eat(); we can not call method from an Animal class directly.
     System.out.println(species +" is eating");
     // to call eat method , we have to use it from an object
    }
     public  void sleeping(){
      System.out.println("This "+ size + " is sleeping");
     }




}
