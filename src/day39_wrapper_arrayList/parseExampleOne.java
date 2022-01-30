package day39_wrapper_arrayList;

import java.util.Scanner;

public class parseExampleOne {
    public static void main(String[] args) {
        String pricerStr = "112.99";
        double priceDouble = Double.parseDouble(pricerStr);
        System.out.println(priceDouble);
        System.out.println("------------");

        String s = "50";
        Integer i = Integer.valueOf(s);
        int i2 = Integer.valueOf(s); // unboxing == gives object type; goes to wrapper class===parse gives the integar type




    }
}
