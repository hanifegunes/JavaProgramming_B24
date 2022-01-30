package GroupSix.Practice.week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInteger {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,45,123,236,65));

        num.removeIf(number -> number>100);

        System.out.println(num);
    }
}
