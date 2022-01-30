package day56_polymorphism.transportation;

public class Car extends Transportation{
    @Override
    public void go() {
        System.out.println("Car -- cae is driving");
    }

    public  void openTrunk(){
        System.out.println("opening the car trunk");
    }
}
