package extraRepeatExamples_2;

public class MidWord {
    public static  char middle(String str){
        return  str.charAt((str.length()/2));
    }

    public static void main(String[] args) {
        System.out.println(middle("lawn"));
        System.out.println(middle("solar"));
        System.out.println(middle("activity"));
    }
}
