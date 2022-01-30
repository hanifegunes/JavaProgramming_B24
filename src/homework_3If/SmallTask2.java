package homework_3If;

import java.util.Scanner;

public class SmallTask2 {
    public static void main(String[] args) {
        System.out.println("what is your salary");

        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        System.out.println("do you work full time");
        String isFullTime = input.next();

        if(isFullTime.equals("yes")) {System.out.println("full time " +(salary +20000));

        }
        else if(isFullTime.equals("no")){
            System.out.println("part time " + (salary - 5000));}





    }
}
