package GroupSix.Practice.week_5;

public class Divisible {

    public static void main(String[] args) {
       // System.out.println(method(15));
        System.out.println(method(45));

    }


/*
Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

 */

    public static String method(int num) {
        String result15 = "";
        String result3 ="";
        String result5 = "";

        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result15 += i+" ";
            } else if (i % 3 == 0) {
                result3 += i+" ";
            } else if (i % 5 == 0) {
                result5 += i+" ";
            }


        }

        return result15+"--"+result3+"==="+result5;


    }
}