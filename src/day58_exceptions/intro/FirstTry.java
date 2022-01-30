package day58_exceptions.intro;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("First line");


        try {
            String s = "java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));    //e is the common name for exception / reference
            // like string s -. stringoutofbounds e

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("We got exception");
            e.printStackTrace();
        }




       // String s = "java";
        //System.out.println(s.charAt(0));
       // System.out.println(s.charAt(100));


        System.out.println("last line");

    }
}
