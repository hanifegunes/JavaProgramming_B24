package day48_static;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class CydeoClassroom {
    public static void main(String[] args) {
        System.out.println(CydeoStudent.batchNumber);
        CydeoStudent studentOne = new CydeoStudent("James Bond",7,7) ;
        System.out.println(studentOne);
        CydeoStudent studentTwo = new CydeoStudent("Sherlock Holmes",16,8);
        System.out.println(studentTwo);
        System.out.println(studentOne.name + "and"+studentTwo.name+ "have the following instructors"+ Arrays.toString(CydeoStudent.instructors));
        System.out.println(CydeoStudent.myCoffee.amountLeft);
        studentOne.myCoffee.drink(3);
        System.out.println(CydeoStudent.myCoffee.amountLeft);
    }
}
