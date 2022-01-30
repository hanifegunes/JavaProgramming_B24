package GroupSix.Practice.week_2;

import java.util.Arrays;

public class MoveZeroToEnd {
    /*
    -- Move zeros to the end
- Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)

     */

   static  void moveZero(int [] a ){
       int lastZero = 0;
       // if current element is not 0, we need to append it just in front of last non 0 element we found

       for(int i = 0; i< a.length; i++){
           if(a[i]!= 0){
               a[lastZero++]= a[i];

           }
       }
       for(int i = lastZero; i<a.length; i++){
           a[i] = 0;
       }
       System.out.println(Arrays.toString(a));


   }

    public static void main(String[] args) {
        int [] a = {0,1,0,3,0,0,365,12,0,13};
        moveZero(a);
    }




}
