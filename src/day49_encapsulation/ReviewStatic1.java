package day49_encapsulation;


public class ReviewStatic1 {
    static int i  =6;
    int a = 4;


    public static void main(String[] args) {
        System.out.println("A");
        new  ReviewStatic1();
        method1();

    }
    public  ReviewStatic1(){
        System.out.println("B");
    }static {
        System.out.println("C");
       // System.out.println(a); static calls just static one, a is instance


    }
    public  static  void  method1(){ // we will call this method with classname and method name
        System.out.println("D");
        System.out.println(i); // can call static , it is in the class
       //  System.out.println(a); can not call instance variable in the static nethod
    }
    public  void method2(){
        System.out.println(i);
    }

}
