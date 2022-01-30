package homework_5arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    /*
    Write a program that will find out shortest words in the given string str.
    If there are few words that are evenly short, print them all.
     Use split method in order to split str string variable and create an array of strings.
      Print array with Arrays.toString() method. Sort array before printing.

> Hint: Split values by comma: split(", ");

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // System.out.println("enter the words");
      //  String  str = scan.nextLine();


        // write your code below




        String  str = "fish, java, part, olc, toy, guy,  volt";


       String [] parts1 = str.split(", ");
       // System.out.println(Arrays.toString(parts));
        String  shortest = str ;

        for( String each : parts1){

            if(each.length() < shortest.length()){
                shortest = ""+each;

            }
        }
        System.out.println(shortest);
        System.out.println("-----------");


        String shortestWord = shortest;
        for (String eachword: parts1){
            if((eachword.length() == shortestWord.length()) && (!eachword.equals(shortest))){
                shortest +=" "+ eachword;
            }

        }


        String [] last =shortest.split(" ");
        Arrays.sort(last);
        System.out.println(Arrays.toString(last));
    }




}




