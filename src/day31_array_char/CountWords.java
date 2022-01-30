package day31_array_char;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        String str = "java is fun";
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length); //3

        System.out.println("=============");
        String str2 = "java is fun, super fun!";
        System.out.println(Arrays.toString(str2.split(" ")));
        System.out.println("------------");


        String cats = "bengal cat tabby cat persian cat no cat here";

        String [] arr = cats.split(" cat ");// space cat space, now it will break the cat and spaces
        System.out.println(Arrays.toString(arr));




    }
}
