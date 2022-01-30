package day09_scanner;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {

       Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int one = keyBoard.nextInt();
        int two = keyBoard.nextInt();
        int three = keyBoard.nextInt();

        String msg = one + " + "+two+" + "+three + " = ";


        System.out.println(msg +one+two+three);
        System.out.println(one+two+three);




    }
}
