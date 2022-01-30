package GroupSix.Practice.week_3;

public class OddEven {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        System.out.println(method(a));
        System.out.println(method(b));
        System.out.println(method(9));

    }

    public static String method(int num){
     //   for (int i = 0; i < num; i++) {

        String result;
         if( num%2 == 0){
                result = "even";

        }   else {
               result = "odd";
            }
         return  result;
    }



}
