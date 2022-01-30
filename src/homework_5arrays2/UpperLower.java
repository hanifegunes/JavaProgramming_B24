package homework_5arrays2;

import java.util.ArrayList;

public class UpperLower {
    public static void main(String[] args) {

        System.out.println(upperLower("ertASD",true));


    }
    public static ArrayList<String> upperLower(String str, boolean given) {
        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> lower = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        boolean result = given;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper.add("" + str.charAt(i));
                last = upper;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lower.add("" + str.charAt(i));
                last = lower;
            }

        }
        return last;


    }


}
