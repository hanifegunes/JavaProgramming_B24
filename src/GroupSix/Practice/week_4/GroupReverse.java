package GroupSix.Practice.week_4;

public class GroupReverse {
    public static void main(String[] args) {

      /*
      String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
       */

       String str = "ABCD";
        System.out.println(reverseWord(str));


    }
    public  static  String reverseWord(String word){
        String reverse = "";

        for(int i = word.length()-1; i>= 0; i--){
            reverse += word.charAt(i);

        }
        return reverse;

    }




}
