package day45_constructors;

import java.util.Arrays;

public class CompanyEmployee {
    public static void main(String[] args) {
        Employees one = new Employees("James Bond", 7, "Agent",1_000_000);
        System.out.println(one);
        one.gotoMeeting();

        Employees [] staff = new Employees[3];// size 3 == 3 dif
        staff[0] = one;
        System.out.println(Arrays.toString(staff));
        staff[1]= new Employees("Nadir", 10, "SDET", 300_000);// this is a new employee object
        System.out.println(Arrays.toString(staff));

    }
}
