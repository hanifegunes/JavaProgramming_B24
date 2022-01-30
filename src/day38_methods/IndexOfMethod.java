package day38_methods;

public class IndexOfMethod {

    public static void main(String[] args) {
        String [] arr = {"a","b", "c"};
        indexOf(arr,"b");
        int index = indexOf(arr,"b");
        System.out.println(index);
        System.out.println(indexOf(arr,"A"));

    }



    /*
    accepts an array and an element return the index of the first occurrence of the element;
    if the element doesn't exist  in our array return -1;
    start with int array;
    after overload to work wih String array.
     */
    public static  int indexOf (int [] nums,int element){
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == element){
                return i;
            }
        }
        /*
        for(int each : nums){
            if( each == element){
               return each;
            } no each , it is about indexes
        }

         */
        return -1;
    }
    public static  int indexOf (String [] arr,String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return -1;


    }

}
