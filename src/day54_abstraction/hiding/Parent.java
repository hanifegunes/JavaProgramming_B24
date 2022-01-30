package day54_abstraction.hiding;

public class Parent {
    public  static  void hello(){
        System.out.println("Hello from parent");
    }
}

class Child extends  Parent{
    public  static  void hello(){
        System.out.println("Hello from child");
    }

}
class Main {
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
    }
}
