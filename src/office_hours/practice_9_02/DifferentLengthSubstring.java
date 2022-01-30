package office_hours.practice_9_02;

public class DifferentLengthSubstring {
    public static void main(String[] args) {
        String str = "mouse";
        String str2 = "cat";

        int countstr = 0;
        int countstr2 = 0;
        String msg = "mouseababccatmouseabcdefcat";


        for(int i = 0; i< msg.length(); i++){
         // if(i <= msg.length() - str.length() && msg.substring(i, i+str.length()).equals(str)) {
                if( i <= msg.length() - str.length() && msg.substring(i, i + str.length()).equals(str)){

              countstr++;
          }

               //if( i <= msg.length() - s.length() && msg.substring(i, i + s.length()).equals(s)){
                 //   counterOne++;
               // }

            if ( i <= msg.length() - str2.length() && msg.substring(i, i+str2.length()).equals(str2)){
              countstr2++;
             // i<= msg.length()-str2.length() === i< msg.length()-3 ( cat has 3 characters)
            }

        }
        System.out.println(countstr);
        System.out.println(countstr2);
        System.out.println(countstr == countstr2);




    }
}
