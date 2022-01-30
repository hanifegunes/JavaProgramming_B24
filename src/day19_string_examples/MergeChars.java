package day19_string_examples;

public class MergeChars {
    public static void main(String[] args) {
       /*
    String one: abc
    String two: def
       merge to get: adbecf
     */



      String one = "abc";
      String two = "def";
      String   reverse = ""+ one.charAt(2)+one.charAt(1)+one.charAt(0);
      if(one.equals(reverse)){
          System.out.println("palindrome");
      }
        else {
          System.out.println("not palindrome");}

        String merged = "";
        merged += one.charAt(0);// merged = merged + one.charAt(0); -> merged = "" + a
        merged += two.charAt(0); // merged = merged + two.charAt(0); -> merged = a + d

          // merged = merged + two.charAt(1); -> merged = ad + b


        merged += one.charAt(1);// merged = merged + two.charAt(1); -> merged = ad + b
        merged += two.charAt(1);

        merged += one.charAt(2);
        merged += two.charAt(2);

        System.out.println(merged);




    }
}
