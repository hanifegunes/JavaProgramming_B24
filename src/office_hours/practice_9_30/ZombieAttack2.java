package office_hours.practice_9_30;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
/*
       [3, 6, 0, 4, 3, 2, 7, 0]
       3 conditions
       if you are 0 in the beginning
       cause the city to the right to lose half population
       if you are 0 in the end
       cause the city to the left to lose half population
       if you are 0 in the middle
       cause the city to the left and right to- both - loose half population
       when to stop?
       all cities pops are 0;
       Array(inhabitants, int [0])=== check with
       [0,0,0,0,0,0,0,0]



      */
         int days= 0;
         int [] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 0};
        System.out.println("Days: "+ days+ Arrays.toString(inhabitants));
         //int [] check = {0,0,0,0,0,0,0,0 };
        // while (!Arrays.equals(inhabitants,check)){

         while (!Arrays.equals(inhabitants, new int[8])){ // will continue until all is 0

            //int [] temp = inhabitants; // this does not copy your array, this is the same object having another reference
            int [] temp = Arrays.copyOf(inhabitants,inhabitants.length); // new array same values

             for(int i = 0;i < inhabitants.length; i++){ // checks all cities day by day
                 if(inhabitants[i] == 0){
                     if(i == 0){
                         // this is the first index - found the 0 at the first index
                        // inhabitants[i+1] /= 2; ---shortcut
                        // inhabitants[i+1] = inhabitants[i+1] / 2;

                         temp[i+1] = temp[i+1] / 2;


                     }
                     else if(i == inhabitants.length-1){
                         // found the 0 at the last index,last city

                         //inhabitants[i-1] = inhabitants[i-1] / 2; // already at the end so i-1
                         temp[i-1] = temp[i-1]/2;

                     }
                     else {
                         // 0 somewhere in the middle ==between first and last

                        // inhabitants[i+1] = inhabitants[i+1] / 2;
                        // inhabitants[i-1] = inhabitants[i-1] / 2;
                         temp[i+1] = temp[i+1] / 2;
                         temp[i-1] = temp[i-1]/2;


                     }
                 }
             }// for loop ends
              inhabitants =Arrays.copyOf(temp,inhabitants.length);
             System.out.println("Days: "+ days + Arrays.toString(inhabitants));



         }





    }
}
