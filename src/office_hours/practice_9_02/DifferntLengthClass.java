package office_hours.practice_9_02;

public class DifferntLengthClass {
    public static void main(String[] args) {
        String s = "mouse";
        String s2 = "cat";

        int counterOne = 0;
        int counterTwo = 0;

        String msg = "mouseababccatmouseabcdefcat";

        for(int i = 0; i < msg.length(); i++){

            if( i <= msg.length() - s.length() && msg.substring(i, i + s.length()).equals(s)){
                counterOne++;
            }

            if( i <= msg.length() - s2.length()  && msg.substring(i, i + s2.length()).equals(s2)){
                counterTwo++;
            }

        }
        System.out.println(counterOne);
        System.out.println(counterTwo);

        System.out.println(counterOne == counterTwo);


    }
}
