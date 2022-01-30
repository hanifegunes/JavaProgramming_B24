package homework_3If;

import java.util.Scanner;

public class PracticeTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUr CODE HERE:
        int out2 = x>= 5   ?   x : -x;

        System.out.println(out2);


    }
}




