package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        String [] id = {"" };
        String [] firstName = {"" };
        String [] lastName = {"" };
        String [] batchNumber = {"" };

        String [] info = { "id","firstName", "lastName", "batchNumber" };
        String [] studentOne = { "001", "James", "Bond", "7"};
        String [] studentTwo = new  String[4];
        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));// null null null null 4 times null=  no info because
        studentTwo[0]= "002";
        studentTwo[1]= "Mr";
        studentTwo[2]="Smith";
        studentTwo[3]="24";

        Scanner input = new Scanner(System.in);


        String [] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your First name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree [2] = input.next();
        System.out.println("Enter your batch number");
        studentThree [3] = input.next();

        System.out.println(Arrays.toString(studentThree));





    }
}
