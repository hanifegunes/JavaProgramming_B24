package day35_methods_parameter;

public class ArrayMethods {
    /*
    make a method accepts the array. find  and print the first element
    make a method accepts the array. find  and print the last element
    make a method accepts the array. find  and print the middle element

     */
    public static void main(String[] args) {
      int [] a = {50,4,100,90,32};
      getFirstArrayElement(a);
      getLastArrayElement(a);
      getMiddleArrayElement(a);

    }


   public static void getFirstArrayElement(int [] nums){


       System.out.println("first element"+nums[0]);
   }
    public static void getLastArrayElement(int [] nums){


        System.out.println("last element"+nums[nums.length-1]);
    }
    public static void getMiddleArrayElement(int [] nums){
       if(nums.length % 2 == 1) { // odd

        System.out.println("middle element"+nums[nums.length/2]);
       }else {
           // even
           System.out.println(" first middle element"+nums[nums.length/2 - 1]);
           System.out.println(" second middle element"+nums[nums.length/2]);
       }


    }


}
