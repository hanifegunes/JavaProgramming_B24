package homework_3methods;

public class EqualNumbers {
    /*

    Create a method that will that accepts three numbers. Check if the three numbers equal to 180.
        If they are equal to 180 print: "This is a triangle"
        If they are equal to 360 print: "This is a circle"

     */
    public static void main(String[] args) {
     // Scanner input = new Scanner(System.in);
     // int [] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
    //  int n = input.nextInt();
     // containNum(nums,n);
        int [] a = {8,5,3,4};
        evenOdd(a);






    }


    public static void equal(int nOne, int nTwo, int nThree){


          int sum = nOne+nTwo+nThree;
         if(sum == 180){
             System.out.println("This is a triangle");
         }if(sum == 360){
             System.out.println("This is a circle");

     }

    }
    public static void sumNumbers(int [] n){
        /*
         Create a method that accept an int array. Take the sum of all the numbers and print the result

         */
        int result = 0;
        for(int i = 0; i < n.length; i++ ){
            result = result + n[i];
        }
        System.out.println(result);

    }
    public static void multiplyNums(int [] nums){

        //Scanner input = new Scanner(System.in);
       // int num = input.nextInt();
        int result2 = 1;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            result2  *= nums[i] ;
            count++;

        }
        System.out.println(result2);
    }
    public static void containNum(int [] nums,int n){
         boolean contains = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                contains = true;
              //  System.out.println(contains);

            }else {
                contains = false;
            }
            System.out.println(contains);
        }


    }
    public static void evenOdd(int [] nums){
        String even = "";
        String odd = "";
        int countEven = 0;
        int countOdd = 0;
       // for(int i = 0; i < nums.length; i++){
        for(int each : nums){
            if(each %2 == 0){

                even = ""+each +", ";
                countEven++;

            }if(each % 2 !=0){
               odd = ""+ each+", ";
              countOdd++;
            }}
            System.out.println("even: " +even + countEven);
            System.out.println("odd: "+odd + countOdd);


    }

}
