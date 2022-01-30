package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateLamda {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("ABCD123$%#@&456EFG!"));
        String str = "ABCD123$%#@&456EFG!";
        String[] strTwo = str.split("");
        arr.removeIf( n -> n.contains("ABCDEFG"));
        System.out.println(arr);
    }
}
