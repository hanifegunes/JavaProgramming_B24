package homework_5arrays;

import java.util.Scanner;

public class SplitSent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter");
        String sentence = input.nextLine();

        //type your code below
        String [] parts = sentence.split(" ");
        // Arrays.sort(parts);
        // System.out.println(parts[0]+"\n"+parts[1]+"\n"+parts[2]);
        for(int i= 0; i < sentence.length()-1; i++){
            System.out.println(parts[i]);

        }


    }
}
