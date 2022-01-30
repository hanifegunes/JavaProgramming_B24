package day54_abstraction.abstract_class;

public class Toyota extends  Car{
   // public abstract   void  start(); when we extend we copy the method here;  so we need to override it ..

    @Override
    public void start() {
        System.out.println("insert the key");
        System.out.println("turn key");
    }
}
