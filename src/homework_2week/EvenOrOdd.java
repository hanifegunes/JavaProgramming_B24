package homework_2week;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
boolean isEven = number%2 ==0;
boolean isOdd = number%2 != 0;
        System.out.println("is number even "+ isEven);
        System.out.println("is number odd "+ isOdd);

    }
}
