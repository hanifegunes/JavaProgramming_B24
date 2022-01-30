package day56_polymorphism.learn_interface;

public interface Mac {
     String NAME = "Mac";  // already public static final , no need to write static final
     String SOFTWARE = "IOS";

    void  turnOn();// public abstract method
    public static  void  getBrand(){
        System.out.println("Apple");
    }
}
  class Runner2{
      public static void main(String[] args) {
          Mac.getBrand();
          System.out.println(Mac.NAME);
          System.out.println(Mac.SOFTWARE);
      }
  }