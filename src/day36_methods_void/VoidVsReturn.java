package day36_methods_void;

public class VoidVsReturn {
    public static void main(String[] args) {
       sayHello();
     //  String str = sayHello(); -- no value
       // System.out.println(sayHello());

        String st = "java";
        int i = st.length();
        char c = st.charAt(0);
        String sub = st.substring(0,1);

    }
    // this is a void method with no parameters
    public static void sayHello(){
        System.out.println("Hello world");

    }public static  String sayBye(){
        return "Bye world";
    }


}
