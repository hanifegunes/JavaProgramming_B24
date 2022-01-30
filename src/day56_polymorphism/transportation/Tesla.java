package day56_polymorphism.transportation;

public class Tesla extends Car implements SelfDrivable, Electric{

    @Override
    public void go() {
        System.out.println("Tesla --- tesla is driving");

    }
    public void charge(){
        System.out.println("Charging");
    }
    @Override
    public void selfDrive() {
        System.out.println("Tesla is in auto pilot");
    }
}
