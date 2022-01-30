package day22_loop_examples;

import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueTalking= true;




       while (true){
           System.out.println("Enter your message");
           String msg = input.nextLine();
           if (msg.equals("hello")){
               System.out.println("hi");
           }else if (msg.equals("bye")){
               System.out.println("okay bye");
               continueTalking = false;
           }
       }

    }
}
