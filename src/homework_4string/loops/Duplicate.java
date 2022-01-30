package homework_4string.loops;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the text");
        String text = input.nextLine();
        System.out.println("repeat time");
        int repeat = input.nextInt();
       // String word1 = "Hello?";
       // String word2 = "java";
        int count = 0;
        //for (int i = 0; i<3; i++){
            for( int i = 0; i <repeat; i++) { // i <= str.length()=1
                text += text.charAt(text.length()-1);

            }
        System.out.println(text);





    }}

