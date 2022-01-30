package homework_4string.loops;

import java.util.Scanner;

public class DuplicatecharactersLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();
        String word1 ="";


        boolean isDuplicate = true;
        for(int i = 0; i< word.length(); i++){
            int count1 = 0;
            for(int j = 0; j< i; j++){
                if(word.charAt(i)== word.charAt(j)){
                    count1++;
                }
            }
            if(count1 >1){
                String newWord = ""+word.charAt(i);
                if(!word1.contains(newWord)){
                    word1 += newWord;
                }
            }

            }

        System.out.println(word1);



    }
}
