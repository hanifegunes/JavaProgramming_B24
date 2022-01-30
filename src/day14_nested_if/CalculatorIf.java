package day14_nested_if;

import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {
        /* ask the user to enter 3 number
        operator - String
        @
        / -> 2nd num=0

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");

        double numberOne = input.nextDouble();
        System.out.println("Enter the operator\n\t+ - * / %");
        String operator =input.next();
        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");
        if(isValidOperator) {
            // TODO: do calculation
            System.out.println("enter number 2" );
            double numberTwo = input.nextDouble();

            double result = 0;
            if (isValidOperator) {
                if (operator.equals("+")) {
                    result = numberOne + numberTwo;
                } else if (operator.equals("-")) {
                    result = numberOne - numberTwo;
                } else if (operator.equals("*")) {
                    result = numberOne * numberTwo;
                } else if (operator.equals("/") && numberTwo != 0)  {
                    result = numberOne / numberTwo;
                } else if (operator.equals("%")) {
                    result = numberOne % numberTwo;
                }
            } else {
                System.out.println(operator + " is not valid");


            }
            if (isValidOperator) {

                System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);
            }

}}}
