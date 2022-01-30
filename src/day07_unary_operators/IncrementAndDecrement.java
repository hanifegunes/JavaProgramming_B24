package day07_unary_operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {

       int n=0;
       n++;
        System.out.println(n);// 1
        System.out.println(++n);// 2

        System.out.println(n++);// prints 2 but n still increment after 2
        System.out.println(n);//3=== 2 den sonra 1 artti

        int age = 10;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);

        System.out.println(++age);
        System.out.println(age);//12

        System.out.println(age++*2);// we increase than we do the action===12*2
        System.out.println(age);//age=13
        System.out.println(++age +2);// before we do any action we increase==14+2
        System.out.println(age);



    }
}
