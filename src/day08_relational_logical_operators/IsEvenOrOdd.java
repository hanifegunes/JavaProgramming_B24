package day08_relational_logical_operators;

public class IsEvenOrOdd {
    public static void main(String[] args) {
    int number = 58;
    boolean isEven = number %2 == 0;
        System.out.println(number +" is even "+isEven );// number 57 is even== false
        boolean isOdd = number %2 != 0;//
        System.out.println(number +" is odd "+ isOdd );// 58/2= no remainder so not equal to 0 , false 0= degildir 0 false

        int number2 = 3;
        boolean isEven1 = number %2 == 0;// 3/2=1 remainder 1 ==0

        System.out.println(number2 +" is even "+isEven1 );







    }
}
