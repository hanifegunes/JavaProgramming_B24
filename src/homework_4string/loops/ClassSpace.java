package homework_4string.loops;

import java.util.Scanner;

public class ClassSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to add space to?");
        String str = input.nextLine().trim();

        String spaceResult = "";

        for (int i = 0; i < str.length(); i++) {// i <= str.length() - 1
            if(str.charAt(i) == ' '){
                spaceResult += "_ ";
            } else {
                spaceResult += str.charAt(i) + " ";
            }
        }

        System.out.println("Translated " + str + " to: ");
        System.out.println(spaceResult.trim());


    }
}
