package day38_methods;

public class OverLoadWithReturn {
    public  static  void method(){
        System.out.println("void method - no parameters");
    }
    public  static int method(int a){
        System.out.println("int method - int parameters");
        return  0;
    }
    public static  String method(String str){
        System.out.println("String method - String parameters");
        return  "";
    }

}
