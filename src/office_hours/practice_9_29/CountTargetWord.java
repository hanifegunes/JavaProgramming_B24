package office_hours.practice_9_29;

import java.util.ArrayList;

public class CountTargetWord {
    /*
    Given an ArrayList of Strings and a target word (String)
     print how many times the target word is in the ArrayList
      Ex:
      Input:
      ”java”, ”html”, “css”,“java”, “javascript”, “selenium”
      Target: java
      Output:
      2
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String [] str = {"java","html","css","java","javascript","selenium"};
       // for(String each : str){
            int count = 0;
            for(int i = 0; i < str.length; i++){
                if(str[i].contains("java")){
                    count++;
                }
            }
            System.out.println(count);

        System.out.println();



    }


}
