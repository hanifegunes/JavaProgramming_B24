package day18_strings;

public class MoreStringMethods {
    public static void main(String[] args) {
       String s="    Apples are   " ;
        System.out.println(s.trim());

        String s2= "     ";
        System.out.println(s2.trim());// removes all spaces

        String s3 = "";
        System.out.println(s3.isEmpty());// true== no space

        String s4 = " ";
        System.out.println(s4.length());
        System.out.println(s4.isEmpty());// false ,

        String s5 ="javascript";
        System.out.println(s5.startsWith("java"));//true
        System.out.println(s5.startsWith("Java"));// false

        String s6 = " jump";
        System.out.println(s6.startsWith("j"));// false there is a space
        System.out.println(s6.startsWith(" j"));// true

        String s7 = "market";
        System.out.println(s7.endsWith("rke"));// false
        System.out.println(s7.endsWith("ker"));// true
        System.out.println(s7.startsWith("market"));//true
        System.out.println(s7.startsWith("market"));// true








    }

}
