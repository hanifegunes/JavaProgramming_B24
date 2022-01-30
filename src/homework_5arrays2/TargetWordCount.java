package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWordCount {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
 */
        ArrayList<String> list = new ArrayList<>();
        String [] str = {"java","html","css","java","javascript","selenium"};

           int count = 0;
          for(int i =0; i<str.length;i++){
              if(str[i].contains("java")){
                  count++;
              }
          }
        System.out.println(count);


    }




}
