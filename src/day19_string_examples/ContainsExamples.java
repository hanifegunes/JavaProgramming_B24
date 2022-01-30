package day19_string_examples;

public class ContainsExamples {
    public static void main(String[] args) {

        String name = " james mr";
        System.out.println(name.contains("mr"));
         String address = "204948 road w drive, 98090";
        System.out.println(address.contains("204") && address.contains("drive"));//true
        System.out.println(address.contains("300") && address.contains("drive"));// false
        System.out.println(name.replaceAll("j","q"));


    }
}
