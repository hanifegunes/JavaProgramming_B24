package extraRepeatExamples;

public class EvenOddArray {
    public static void main(String[] args) {

        /*

        declare an int array
        count how many even number there is
        count how many odd numbers there is

        print your counters

        challenges:
            traditional for loop
            for each loop

            - not hard code in initial array, but use scanner to get the numbers

     */
        int [] nums = {4,5,6,8};
        int odd= 0;
        int even= 0;
        String evenNum = "";
        String oddNums = "";
        for(int i = 0; i < nums.length; i++){
            if(nums [i] % 2 == 0){
                even++;
                evenNum +=nums [i]+"";
            }else {
                odd++;
                oddNums += nums[i]+"";
            }

        }
        System.out.println("even: "+evenNum+ " "+even);
        System.out.println("odd: "+ oddNums + " "+odd);




    }
}
