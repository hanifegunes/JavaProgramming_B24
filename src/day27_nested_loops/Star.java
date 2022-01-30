package day27_nested_loops;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ");
        int n = input.nextInt();
        String star = "*";
        for(int i = 1; i< n; i++){

            for (int j = 1; j < i ; j++){
            System.out.print(star);
        }
            System.out.println();
        }

    }

}
