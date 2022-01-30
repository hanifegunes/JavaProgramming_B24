package day31_array_char;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday,tuesday, wednesday";

        // Split up a String into a String array
        String [] days = str.split(",");

        System.out.println(Arrays.toString(days));

        String str2 = "Jan - Feb - Mar -Apr";

        String [] months = str2.split(" - ");
                System.out.println(Arrays.toString(months));





    }
}
