package day15_switch;

import java.util.Scanner;

public class HomeWorkdays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is day number");
        int dayNum = input.nextInt();
        boolean isDay = true;


                switch (dayNum){
                    case  1 :
                        System.out.println ("monday");
                        break;

                    case  2 :

                        System.out.println("tuesday");
                        break;
                    case 3 :

                        System.out.println("wednesday");
                        break;
                    case 4 :

                        System.out.println("thursday");
                        break;
                    case  5 :

                        System.out.println("friday");
                        break;
                    case  6 :

                        System.out.println("saturday");
                        break;
                    case  7 :

                        System.out.println("sunday");
                        break;
                    default:
                        System.out.println("invalid day");

                        isDay = false;



                }


        }}














