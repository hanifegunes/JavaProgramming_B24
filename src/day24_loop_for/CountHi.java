package day24_loop_for;

public class CountHi {
    public static void main(String[] args) {
        String s = "aahiahiaaahh";
        int hiCounter =0;  // i cycle,each iterations
        for( int i = 0; i<s.length()-1; i++){ // or i<= s.length()-2
            if (s.charAt(i)== 'h' && s.charAt(i+1) == 'i'){
                hiCounter++;
            }
        }System.out.println("Hi counter "+ hiCounter);
    }
}/* aa
     ah
     hi
     ia
     ah
     hi
     ia
     aa
     aa
     ah
     hh
     h  10,11---- 11<11 not anymore  so it  is problem so we will stop at the end of word ..so word.length()-1
*/



