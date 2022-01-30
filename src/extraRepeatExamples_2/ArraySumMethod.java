package extraRepeatExamples_2;

public class ArraySumMethod {
    public static void main(String[] args) {
        int [] arr = {3,4,5};
        System.out.println("summ of elements: " + sumElements(arr));
    }








    public  static  int sumElements(int [] arr){
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }


}
