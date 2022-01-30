package homework_4string;

public class ReplaceMethod {
    public static void main(String[] args) {
      String word ="java";
      word =word.replace('a','e');// should reassign === jeve
        System.out.println(word);

        String word2 = "softskils";
        System.out.println(word2.replace('s','X'));

        String msg = "Hello today is Sunday";
        System.out.println(msg.replace(" ", ""));// replace the empty places
        System.out.println(msg);




    }
}
