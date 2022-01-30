package day21_loops;

public class Alphabet {
    public static void main(String[] args) {
        /*
        print letter from a-z
         */
        char letter = 'a';
        while(letter<= 'z'){
            System.out.print(letter++ + " ");// print everything is in the same line--println altalta....
        }
        System.out.println();
        char letter2 = 'z';
        while(letter2 >= 'a'){
            System.out.print(letter2-- + " ");}



    }
}
