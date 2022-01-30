package day56_polymorphism.transportation;

public class Road {
    public static void main(String[] args) {

         Car obj1 = new Car();
          obj1.go();
            // Car object
        Car obj2 = new Car();
        obj2.go();
        obj2.openTrunk();

        System.out.println("------");

        Transportation obj3 = new Car();
        obj3.go();
       // obj3.openTrunk(); transportation reference for the car does not have access to the openTrunk method

        Tesla t1 = new Tesla(); //itself
        Car t2 = new Tesla();   //super

        Transportation t3 = new Tesla(); //super

        Electric t5 = new Tesla();




    }
}
