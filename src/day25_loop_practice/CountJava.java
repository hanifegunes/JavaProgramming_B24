package day25_loop_practice;

public class CountJava {
    public static void main(String[] args) {
      String str ="java is a language. java can be used a lot of java";
      int javaCounter = 0;
      for (int i = 0; i < str.length()-3; i++){ // i<= length()-4;

          //System.out.println(str.substring(i,i+4));// java has 4 characters.0123 so length -3 means 4 characters
          if(str.substring(i,i+4).equals("java")){
              javaCounter++;
          }
      }

        System.out.println(javaCounter);
      /* java is a language
      java    0,4    i,i+4
       ava    1,5   i, i + 4
       va i   2,6   i, i + 4
            ...

       */


    }
}
