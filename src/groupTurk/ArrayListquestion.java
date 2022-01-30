package groupTurk;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListquestion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(23,4,10,3,14,1,6,16,9,34,5));
        String s="";
        for (int i = 0; i < numbers.size(); i++) {

            if(numbers.get(i)>10){
                continue;
            }
            if(numbers.get(i)%3==0){ // 4,10,3,1,6,9,5
                s+="1";   //0010110
            }else{
                s+="0";
            }
        }
        System.out.println(s);
    }

}
