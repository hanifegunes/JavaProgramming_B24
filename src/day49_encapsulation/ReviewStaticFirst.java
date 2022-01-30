package day49_encapsulation;

public class ReviewStaticFirst {
    static  int i = 9;

    public static void main(String[] args) {
        System.out.println("second ->main method");
        new ReviewStaticFirst();
        method1();
        System.out.println(returnString("s"));

    }
    public  ReviewStaticFirst(){
        System.out.println("Third -> construction");
    }
    static {
        System.out.println("First ->static block");
    }
    public  static  void  method1()
    {
        System.out.println("Fourth -> method");
        System.out.println(i + ": inside the method");
    }
    public  static  String returnString(String str){
        str = "fifth => this is return method";
        return  str;
    }
}
