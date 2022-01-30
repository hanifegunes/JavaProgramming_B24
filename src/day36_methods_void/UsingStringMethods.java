package day36_methods_void;
import my_utulities.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("java"));
        System.out.println(StringUtil.reverse("soft skills"));

        String str = "racecar";
        String str2 = StringUtil.reverse(str);
        System.out.println(str.equals(str2));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some words to reverse");
        System.out.println(StringUtil.reverse(input.nextLine()));
        System.out.println("=============");
        System.out.println("Enter your name");
        System.out.println(StringUtil.fixFormat(input.next()));
        System.out.println("Enter your last name");
        System.out.println(StringUtil.fixFormat(input.next()));



    }
}
