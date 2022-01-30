package day34_methods;

public class FirstMethod {

    public static void helloWorld(){
        System.out.println("Hello World");
    }
    public static void helloWorld50Times(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
    }


    // the main is used to call our method
    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        for(int i = 0; i< 5; i++){
            helloWorld();
        }
        System.out.println("=============");
       helloWorld50Times();
        System.out.println();
        helloWorld50Times();

    }



}
