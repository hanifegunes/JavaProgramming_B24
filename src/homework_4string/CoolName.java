package homework_4string;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name= input.next();
        if (name.startsWith("a") || name.startsWith("z")){

            System.out.println("Your name is cool!!");
        }else if(name.endsWith("m")){
            System.out.println("Almost cool");
        }



        else {

            System.out.println("Sorry, your name is not cool");
        }


    }
}
