package day19_string_examples;

public class EachCharacter {
    public static void main(String[] args) {
        String java = "java";
        //             0123

        // charAt(number)gives a char based on the number you give

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));

       //  System.out.println(java.charAt(4)); this is a problem== does not exist

        char firstLetter = java.charAt(0);
        System.out.println(java.charAt(0)+java.charAt(1)+java.charAt(2)+java.charAt(3));// adding
        System.out.println(""+java.charAt(0)+java.charAt(1)+java.charAt(2)+java.charAt(3));// making everything string with"" so concatenation not adding





    }
}
