package office_hours.practice_10_27;

import java.util.ArrayList;

public class TestModule {
    public static void main(String[] args) {
        Module day1 = new Module();

        File notes = new File ("day1 notes", 0.4);
        day1.files.add(notes);
        System.out.println(day1.files.get(0));
        day1.files.get(0).openFile();
     /*
        ArrayList<String>list;
                list.get(0).charAt(0)

      */

        day1.files.add(new File("pdf",0.5));
        System.out.println(day1.files);
    }
}
