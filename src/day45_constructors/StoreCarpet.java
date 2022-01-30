package day45_constructors;

import java.util.concurrent.Callable;

public class StoreCarpet {
    public static void main(String[] args) {

        Carpets carpets = new Carpets (10,4,0.5,false);
        System.out.println(carpets);
        Carpets carpet2 = new Carpets(10,4,0.5,true);
        System.out.println(carpet2);
    }
}
