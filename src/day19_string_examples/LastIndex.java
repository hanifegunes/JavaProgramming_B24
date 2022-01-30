package day19_string_examples;

public class LastIndex {
    public static void main(String[] args) {
        // indexOf() == first occurrence
        // lastIndexOf == last occurrence
        //    0123

        String str = "java";
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.lastIndexOf('a'));//3

        System.out.println(str.indexOf('v'));// it's first and last ==2
        System.out.println(str.lastIndexOf('v'));// no change ==2


    }
}
