package extraRepeatExamples;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] name ={'s','u','n','d','a','y'};
        String name1  = new String(name);
        System.out.println(name1);
        System.out.println("+++++++++");
        String key = "sunday fun day";
        char [] key1 = key.toCharArray();
        System.out.println(Arrays.toString(key1));

        String last = "java, is, fun";
        String [] last1 = last.split(",");
        System.out.println(Arrays.toString(last1));
        System.out.println("-------------");

        System.out.println(Arrays.toString(last.split(",")));

    }
}
