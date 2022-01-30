package day25_loop_practice;

public class Syllables {
    public static void main(String[] args) {
        String str = "ja-va";
        int count = 0;
        String syllables = "";
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) == '-'){
                count++;
            }


        }
        System.out.println(count+1);
        /*str.charAt(0) == '-'
        str.charAt(1) == '-'
        str.charAt(2) == '-'


         */
    }
}
