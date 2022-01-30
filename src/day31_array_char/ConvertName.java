package day31_array_char;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.next();
        char [] name1 = name.toCharArray();
        System.out.println(Arrays.toString(name1));
        System.out.println("----------------");
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("-------------");
        System.out.println(name.toCharArray()[0]);// gives first character of name j-a-m-e-s===j ---valid
        System.out.println("=========");
        System.out.println(name1[0]);// gives first character of name j-a-m-e-s===j
        System.out.println(name1[name1.length-1]);// gives last character ==s
        System.out.println(name1[0]+" "+name1[1]);


    }
}
