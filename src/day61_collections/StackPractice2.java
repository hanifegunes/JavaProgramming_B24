package day61_collections;

import java.util.Stack;

public class StackPractice2 {
    public static void main(String[] args) {

        Stack<Integer> stack =new Stack<>();
        stack.add(20);
        stack.add(50);
        stack.add(100);
        stack.add(80);
        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop()); // last one is 80 and removed with pop
        System.out.println(stack.pop());  // last one is 100 and removed with pop
        System.out.println(stack);      // 20-50 remained




    }
}
