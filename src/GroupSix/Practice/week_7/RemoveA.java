package GroupSix.Practice.week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveA {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList(Arrays.asList("Ahmed", "John", "Eric"));
        System.out.println(liste);
        liste.removeIf(word -> word.equals("Ahmed"));
        System.out.println(liste);


    }
}
