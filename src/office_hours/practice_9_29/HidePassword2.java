package office_hours.practice_9_29;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword2 {


    /*
       Given an array of passwords (String).
        Hide each password as a star (*) and show the hidden password
        Ex:Input:
       {"one",  "hi", "hold}
        Output: [ ***, **, **** ]
        */
    public static void main(String[] args) {
        String[] password = {"one", "hi", "hold" };
       // String stars = "";

    ArrayList<String> hidePassword  = new ArrayList<>(password.length);

           // String stars = "";
            for (String each : password) {
                String stars = "";

                for (int j = 0; j < each.length(); j++) {
                    stars += "*";
                }
                hidePassword.add(stars);
            }
        System.out.println(hidePassword);
        }
    }













