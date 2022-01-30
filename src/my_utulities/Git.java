package my_utulities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Git {
    public static void main(String[] args) {
        Random r = new Random ();
        String [] s = {"fuat", "tagun","luzia"};

        ArrayList<String> students = new ArrayList<>(Arrays.asList(s));

        int a = 10;
        while ( (a-- > 0)){
            String str = students.get(r.nextInt(students.size()));
            System.out.println(str);
        }
    }
}
