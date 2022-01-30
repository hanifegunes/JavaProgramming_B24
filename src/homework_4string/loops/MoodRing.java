package homework_4string.loops;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter color");

        String color = input.next()
                .trim()
                .toLowerCase();
        int budget = 0;
        String mood = "";
        switch (color){
            case ("pink"):
                budget = 200;
                mood ="happy";
                System.out.println("mood: "+mood);
                System.out.println("budget: "+ budget);
                break;
            case ("blue"):
                budget = 150;
                mood ="relaxed";
                System.out.println("mood: "+mood);
                System.out.println("budget: "+ budget);
                break;
            case ("orange"):
                budget = 50;
                mood ="nervous";
                System.out.println("mood: "+mood);
                System.out.println("budget: "+ budget);
                break;
            case ("red"):
                budget = 0;
                mood ="angry";
                System.out.println("mood: "+mood);
                System.out.println("budget: "+ budget);
                break;// no need break at the end
            default: // can be anywhere
                System.out.println("no color");
        }








        }


            }










