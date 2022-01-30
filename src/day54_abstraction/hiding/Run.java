package day54_abstraction.hiding;

public class Run {
    public static void main(String[] args) {
        A a = new A();
        a.staticMethod();// A
        a.instanceMethodA();// A

        B b = new B();
        b.staticMethod();// B
        b.instanceMethodB();//B




    }
}
