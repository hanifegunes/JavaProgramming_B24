package day25_loop_practice;

public class Vowels {
    public static void main(String[] args) {
       String str = "java is great" ;
       int count = 0;
       String vowels = "aeiou";
       for( int i =0; i< str.length(); i++){
           // first character -0- j to 2. character, 2.nd not inc.
          // System.out.println(str.charAt(i));    this is char data type,gives a character contains
          // System.out.println(str.charAt(i +1));

             if(vowels.contains(str.substring(i,i+1)))  {  // if(str.contains(""+ str.charAt(i))) ===another way
                   count++;



             }




       }



    }

}
