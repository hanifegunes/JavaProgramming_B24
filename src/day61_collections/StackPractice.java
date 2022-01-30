package day61_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();  //LIFO
        stack.push("a");   // push adds elements  to the top of the stack
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("At the top of my stack: "+ stack.peek());// returns/ shows -> what is at the top of the stack

        stack.pop(); // takes which one is on the top and removes it
        System.out.println(stack);

        System.out.println(stack.pop());/// b is on the top

        System.out.println(stack); // b is removed now ; we have just c;

        System.out.println(stack.get(0));



    }
}
