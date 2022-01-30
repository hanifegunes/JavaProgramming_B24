package day15_switch;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which browser do you want to use ");
        String browser = input.next();
        System.out.println("enter the url");
        String url = input.next();
        switch (browser){
            case "chrome":
                System.out.println("opening " + url + " in chrome");
                break;
            case "firefox":
                System.out.println("opening "+ url +" in firefox");
                break;
            case "safari":
                System.out.println("your mac opening safari");
                break;
            case "ie":
                System.out.println("IE is not longer supported");
                break;
            case "edge":
                System.out.println("Edge is opening "+ url);
                break;
            default:
                System.out.println( "invalid browser");

        }


    }
}
