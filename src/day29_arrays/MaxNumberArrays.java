package day29_arrays;

public class MaxNumberArrays {
    public static void main(String[] args) {
       int [] numbers = { 6,2, 8, 4 };
       int max = numbers[0]; // better than just giving 0;
        if( numbers[0] > max){ // 6 > 0
            max = numbers[0];// max = 6
        }
        if( numbers[1] > max){ //2 > 6
            max = numbers[1]; // false
        }
        if( numbers[2] > max){ //8 > 6
            max = numbers[2]; // max 8
        }
        if( numbers[3] > max){ // 4 > 8
            max = numbers[3]; // false
        } // last max is 8

        System.out.println(max);
    }
}
