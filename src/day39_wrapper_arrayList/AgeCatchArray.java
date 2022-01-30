package day39_wrapper_arrayList;

import java.util.Scanner;

public class AgeCatchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter text");
        String str = input .nextLine();
        String numberOnly = str.replaceAll("[0-9]","");
        System.out.println(numberOnly);
        int i = Integer.parseInt(numberOnly);
        System.out.println("in 5 years "+ (i+5));





    }
}
