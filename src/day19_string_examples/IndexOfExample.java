package day19_string_examples;

public class IndexOfExample {
    public static void main(String[] args) {


     String s = "javava";
        System.out.println(s.indexOf('j'));//0
        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('z'));//-1
        System.out.println(s.indexOf('v')); //2


        System.out.println(s.indexOf("ja"));//0
        System.out.println(s.indexOf("ava"));//1
        System.out.println(s.indexOf("Va"));//-1
        System.out.println(s.indexOf("va")); //2






    }
}
