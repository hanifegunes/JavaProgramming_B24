package homework_2week;
import java.util.Scanner;
public class PersonalInfo {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        byte age = scan.nextByte();
        System.out.println("favorite number: ");
        long number = scan.nextLong();
        boolean isStudent = 7<= age&& age <= 27;

        System.out.println("your name: "+age +"\nyour favorite number: "+number+  "\nare you a student? " +isStudent );






    }

}
