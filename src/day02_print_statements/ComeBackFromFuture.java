package day02_print_statements;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.a = 1; // a works , it is a = public int
        //obj.b = 2;b is default because we are in the different package, it can work just in the same package = int b
        //obj.c = 3; // private , so can work just in the same class,don't work out of the class= private int c
    }
}
