package homework_4string.replit;

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for (int i =n; i>0; i++){
            char t ='*';
            i*= t;
            System.out.print(t);
        }


    }
}
