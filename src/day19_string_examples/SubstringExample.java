package day19_string_examples;

public class SubstringExample {
    public static void main(String[] args) {
         /*
            substring allows you to take part of the String based on the given index number
            when you give one number, that is that starting of your substring and it keeps all the characters until the end
         */
        //          01234...




       String s = "javascript";
        System.out.println(s.substring(1));// avascript
        System.out.println(s.substring(2));//vascript

        System.out.println(s.substring(0,4));
        System.out.println(s.substring(4));
        System.out.println(s.substring(2,6));//sc




    }
}
