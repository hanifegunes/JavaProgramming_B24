package day54_abstraction.hiding;

public class A {

    public static void staticMethod() {
        System.out.println("A");
    }


    public void instanceMethodA(){
        staticMethod();
    }
}
/*
Yusuf Kaya — Today at 10:54 AM
I have an analogy (hopefully it won’t confuse you more 🙂 )
•    When a grandparent is alive and he wants to change his name (OVERRIDE)
•    When a grandparent passes away and cannot change his name anymore (STATIC) This means you can still inherit, but cannot change his name anymore
•    When you have a newborn baby and you name him same as the grandparent’s name, then they will have the same name, but they are actually 2 different people in the family meaning 2 different methods in the same class (which is what we are doing today)

****
Abstraction is the concept of object-oriented programming that “shows” only essential attributes and “hides” unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users. Abstraction is selecting data from a larger pool to show only relevant details of the object to the user. It helps in reducing programming complexity and efforts. It is one of the most important concepts of OOPs.


 */
