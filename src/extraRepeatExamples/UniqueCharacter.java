package extraRepeatExamples;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String str= input.next();
        System.out.println("enter the letter");
        char letter = input.next().toLowerCase().charAt(0);
       // char dfg = input.next().charAt(0);
        int count = 0;
        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i)== letter){
                count++;
            }}
        if (count == 1){
                System.out.println("letter "+ "unique");
            }else if(count == 0){
            System.out.println("no letter");
        } else {
            System.out.println("not unique");
        }
        }

}
