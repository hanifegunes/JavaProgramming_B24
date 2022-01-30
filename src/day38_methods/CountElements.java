package day38_methods;

public class CountElements {
    /*
    accepts an int array and a number
    count and return the number of times the given number is found in the array
     */
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,1,1,5};
        System.out.println(frequencyOfElement(arr,1));
        System.out.println(frequencyOfElement(arr,5));
        System.out.println(frequencyOfElement(arr,7));// no
        getUniqueElement(arr);

    }



    public static int frequencyOfElement(int [] arr, int element) {

        int counter = 0;
        for( int each : arr){
            if(each == element){
              counter++;
            }
        }
       return counter;

    }
/*
given a int array ,find and print all of the unique elements
 */
    public static void getUniqueElement(int [] nums ){
       for(int each : nums){
           int counter =frequencyOfElement(nums,each);
           if(counter == 1){
               System.out.println(each);
           }
       }

    }

}
