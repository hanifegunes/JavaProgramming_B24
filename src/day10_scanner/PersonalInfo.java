package day10_scanner;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:  ");
        byte age = input.nextByte();

        System.out.println(" Enter your favorite number: ");
        long favoriteNumber = input.nextLong();

        System.out.println("Are you a student? ");
        boolean isStudent = input.nextBoolean();

        System.out.println("this is your personal info");
        System.out.println("age: "+ age );
        System.out.println("favorite number "+ favoriteNumber);
        System.out.println("are you a student? " + isStudent);



    }
}
