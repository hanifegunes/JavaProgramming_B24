package day06_arithmetic_operators;

public class OperatorsExample {
    public static void main(String[] args) {
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println(10/5);
        System.out.println(10.0/5);//double/int=double
        System.out.println(10.0/3.0);
        System.out.println((int)(10.0/3.0));
        System.out.println((int)10.5/3.0);// takes just 10 as int no .5
        System.out.println((int)(10.5/3.0));

        byte b1= 10;
        byte b2 = 5;
       //  byte b3 =  b1+b2 error
        int b3 =  b1+b2; // int variable
        byte b4 = (byte)(b1+b2);
        System.out.println(b4);
        System.out.println(10%3);
        // 10=(3+3+3)+1 - 1 is the reminder leftover





    }
}
