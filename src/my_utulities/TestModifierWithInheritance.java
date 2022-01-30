package my_utulities;

import day51_inheritance.Modifier;

public class TestModifierWithInheritance  extends Modifier{
    public static void main(String[] args) {
        Modifier obj = new Modifier();
        System.out.println(obj.A);
        // System.out.println(obj.B);can not be accessed, it is protected, and we are in diff. package
        // System.out.println(obj.C);can not be accessed because it is default, and we are in the different package
        TestModifierWithInheritance obj2 = new TestModifierWithInheritance();
         System.out.println(obj2.B);
         System.out.println(obj2.A);



    }
}
