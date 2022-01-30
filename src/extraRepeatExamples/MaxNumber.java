package extraRepeatExamples;

public class MaxNumber {
    public static void main(String[] args) {
        int [][] nums = {
                {4, 5, 40, 1400, 1409, 12},
                {200, 3000, 3940},
                {10, 200, 40},
        };
         int max = nums[0][0];
         for(int [] eachArray : nums){

                 for(int eachNumber : eachArray){
                     if( eachNumber > max){
                          max = eachNumber;
                     }}

         }
        System.out.println("max: "+ max);





    }
}
