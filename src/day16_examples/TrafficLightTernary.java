package day16_examples;

import java.util.Scanner;

public class TrafficLightTernary {
    public static void main(String[] args) {
        boolean isGreen = true;
        String action=  isGreen ? "go" : "stop";//: else gibi
        System.out.println(action);
        String  name = "Nadir";
        String  className = name.equals("Nadir")? "Soft skills" : "Java";
        System.out.println(className);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = input.nextInt();
        System.out.println(number %2 == 0 ? "Even number" : "Odd number");
/*
    '''condition ? expression1 : expression2;

Here, condition is evaluated and

    if condition is true, expression1 is executed.
    And, if condition is false, expression2 is executed.'''

 */
        System.out.println("Enter number one");
        double numberOne = input.nextDouble();
        System.out.println("Enter number two");
        double numberTwo = input.nextDouble();
        double max = numberOne>numberTwo ? numberOne : numberTwo;
        System.out.println(max);


    }
}
