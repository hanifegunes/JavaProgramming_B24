package day22_loop_examples;

public class Factorial {
    public static void main(String[] args) {
        /*FactorialNumber
  write a program that can return the factorial number of any given number Ex:input: !5 output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


         */
        int number = 6;
        int total = 1;
        while(number>1 ){
            System.out.println(total+ "* "+number+" ");
            total *= number;// total = total+number

            number--;

        }
        System.out.println(total);







    }
}
