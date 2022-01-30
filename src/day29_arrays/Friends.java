package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you want to enter");
        String [] friendList = new String[input.nextInt()]; // you can do in this way too, no deed extra int friendList = input.nextInt();

        for(int i = 0; i< friendList.length ; i++){
            System.out.println("Enter the name: "+ (i+1));
            friendList[i] = input.next();
        }


        System.out.println(Arrays.toString(friendList));


    }}
