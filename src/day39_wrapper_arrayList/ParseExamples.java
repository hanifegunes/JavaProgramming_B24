package day39_wrapper_arrayList;

import java.util.Scanner;

public class ParseExamples {
    public static void main(String[] args) {
        String year = "2009";
        System.out.println(year+1);
        int intYear = Integer.parseInt(year);
        System.out.println(year);
        System.out.println(intYear);
        System.out.println(year+1);// conc. 2009+1= 20091
        System.out.println(intYear+1);// actual math 2009+1=2010
        /*
        ask the user to enter some text;
        I am x years old;
        in 5 years you will be x+5 text
         */
        System.out.println("how old are you");
        Scanner input = new Scanner(System.in);
       String  text = input.nextLine();
        int intYear1 = Integer.parseInt(text);
        System.out.println(intYear1+5 +" in 5 years your age is ");
        System.out.println("in 5 years your age is " +(intYear1+5));
        System.out.println("================");
        //String [] arr = text.split(" ");
       // String ageText = arr[2];

        String ageText = text.split(" ")[2];// returns string array , so that [2]second element  "I am 10 years old" second one is -10-  [ "I" "am" "10" "years" "old"]==arr[2] is second element of array- like above
         int age = Integer.parseInt(text);
        System.out.println(age);
        System.out.println("-----------");
        System.out.println("in 5 years you will be  "+ (age+5));




    }
}
