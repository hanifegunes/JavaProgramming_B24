package day25_loop_practice;

public class CharactersInString {
    public static void main(String[] args) {
      /*Given a String print the ascii value codes for each character
      Ex:Input:“java”
      Output:  1069711897

 */
    String str = "java";

    for( int i = 0; i< str.length(); i++){
        System.out.print((int)str.charAt(i) + " ");
    }



    }
}
