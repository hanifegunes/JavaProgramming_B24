package homework_5arrays2;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String [] arr = {"java","html","css","java","javascript","selenium"};
        int count = 0;
        char ch = 'a';
        for(int i = 0; i< arr.length; i++){
           // int count = 0;
           // for(int j = 0; j< arr.length; j++){
           //if(arr[i]== arr[j])
             if(arr[i].contains("l"))    {
           count++;}
           // System.out.println(count);
        }
        System.out.println(count);


    }
}
