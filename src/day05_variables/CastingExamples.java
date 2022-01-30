package day05_variables;

public class CastingExamples {
    public static void main(String[] args) {


        long number= 90;// stores in long automatically
        long number2 = 100L; // type is int casts to long,

        short number3 = 10;
        float number4 = number3;

        System.out.println(number4);


        // Bigger to smaller
        long number5 = 11;
        int number6 =(int) number5;// big number can be stored into int with (int)
        System.out.println(number6);

        double number7 = 40.5;
        int number8= (int)number7;
        System.out.println(number7);

        int number10 = 200;
        byte number11 = (byte)number10;
        System.out.println(number10);


        long a = 3_000L;
        double b = (float)a;
        System.out.println(b);







    }
}
