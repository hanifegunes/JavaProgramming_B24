package homework_4string.loops;

import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = input.next()
                        .trim();
        System.out.println("Enter your last name");
        String  lastName  = input.next();
        name = name.substring(0,1)
                .toLowerCase();
        //String id  = ""+name.charAt(0);

        lastName = lastName.substring(0,1).toUpperCase() +lastName.substring(1,3).toLowerCase()+lastName.substring(3,4).replace('t','8');
        System.out.println(name+lastName);
        System.out.println(name+lastName+name.length()*2);




    }
}
