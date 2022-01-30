package day22_loop_examples;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String pickedColor ="";
        int colorsPicked = 0;

        while( colorsPicked < 3 ) {
            System.out.println("Enter colors");
            String color = input.nextLine();

            if (pickedColor.contains(color)) {
                System.out.println("pick a different color");

            } else{

                pickedColor += color + " ,";
            colorsPicked++;

        }


        }
        System.out.println("you picked "+ pickedColor);






    }


}
