package day38_methods;

import java.util.Arrays;

public class AddToArray {
    /*
     accept an array an int array and number
     we want to return a new array with the number added to the end of the array
     input:
     {1,2,3},5
     {1,2,3,4,5}
     */
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println(Arrays.toString(addElement(a,10)));
    }



    public static int []addElement (int [] arr,int element){
        int [] newArr = new int[arr.length+1] ;// added 1 to new array's size
        for(int i = 0; i < arr.length; i++){ // coppied the array
            newArr[i] = arr[i];

        }
        newArr[newArr.length-1] = element;
        return  newArr;
    }
}
