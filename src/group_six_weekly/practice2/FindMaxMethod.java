package group_six_weekly.practice2;

public class FindMaxMethod {
/*Q9:Array -- Find Maximum:  Write a method that can find the maximum number from an int Array.
   Find Minimum: Write a method that can find the maximum number from an int Array.
   -- sum of digits in a string: Write a method that can return the sum of the digits in a string
 */




    public static void main(String[] args) {
        int [] nums = {4,8,5,2,4,6};
        String [] str= {"4","7","5"};
        System.out.println(max(nums));
        System.out.println(min(nums));
        System.out.println(sum(nums));


    }

    public  static int max(int [] num ){
        int max = num[0];
      for(int i = 0; i<num.length; i++ ){
         if(max < num[i]){
             max = num[i];
         }
      }return max;

    }
    public static  int min(int [] num){
        int min = num[0];
        for(int i = 0; i< num.length; i++){
            if(min> num[i]){
                min = num[i];
            }
        }return  min;
    }
    public  static int sum(int [] num){
        int total = 0;
        for(int i = 0; i <num.length; i++){
            total += num[i];
        }
        return total;
    }


}
