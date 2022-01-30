package day34_methods;

public class GetCharacters {
    /*Print each one in one line
    make a method that will print all the letters from A-Z
    make a method that will print all the letters from a-z
    make a method that will print all the letters from Z-A
    make a method that will print all the letters from z-a
    make a method that will print all the letters from 0-9
     */
    public static void lettersAToZ(){
        for(char i = 'A'; i<= 'Z';i++){
            System.out.print((char)i +" ");
        }
    }

    public static void lettersZtoA(){
        for(char i = 'Z'; i>= 'A'; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
    }

    public static void printaToz(){
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print((char)i+" ");
        }


    }
    public static void printzToa(){
        for(char i = 'z'; i>= 'a'; i--){
            System.out.print((char)i+" ");
        }

    }
    public static void numbers(){
        for(int i = 0; i<=9; i++){
            System.out.print((i)+" ");
        }


    }

    public static void main(String[] args) {
        lettersZtoA();
        System.out.println();
        lettersAToZ();
        System.out.println();
        printaToz();
        System.out.println();
        printzToa();
        System.out.println();
        numbers();
    }


}
