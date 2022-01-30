package day17_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";
        System.out.println(name.equals("james")); // true
        System.out.println(name.equals("James")); // false
        System.out.println(name.equalsIgnoreCase("James"));// true
        System.out.println(name.equalsIgnoreCase("jaMes"));// true
        System.out.println(name.toUpperCase());// JAMES
        System.out.println(name);// james

        String lastName = "bond";
        lastName.toUpperCase();
        System.out.println(lastName);//bond
        lastName = lastName.toUpperCase();
        System.out.println(lastName); //BOND
        System.out.println(lastName.toLowerCase());// bond
        System.out.println(lastName);//BOND
        // LENGTH
        String word = "monday";
        int length = word.length();
        System.out.println(length) ;//6
        String word2 = "monday ";// 7 with the space it has 7 characters
        int length2 = word2.length();
        System.out.println(length2);




    }
}
