package extraRepeatExamples;

import java.util.Scanner;

public class UniqueLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();
        System.out.println("enter the letter");
        String result = "";
        char letter = input.next().toLowerCase().charAt(0);
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i)==letter){
                count++;
            }if(count== 1){
                result = "unique";
            }else {
                result = "not unique";
            }
        }
        System.out.println(letter +" "+ result);



    }
}
