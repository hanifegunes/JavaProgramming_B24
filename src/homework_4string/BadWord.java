package homework_4string;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine().toLowerCase();// recognize lower case
        String msg = "";
        //boolean hasbadword = word.contains("idiot") || word.replace(" ","").contains("dumb") || word.contains("heck")
        // if(hasbadword)
        if( word.contains("idiot") || word.contains("dumb") || word.contains("heck")){
            msg = "Message not send";

        }else {
            msg = "Message sent";
        }
        System.out.println(msg);

    }
}
