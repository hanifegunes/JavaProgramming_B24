package OfficeHomework;

import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter time");

        int time = input.nextInt();
        if( time>0 && time <24) {
        String morning = time >0 && time < 11 ? "morning": "night";
        System.out.println(morning);}
        else {
            System.out.println("not valid");
        }


    }
}
