package GroupSix.Practice.week_2;

import java.util.Arrays;

public class SumOfArrayZero {
    /*
    Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can
return any such array.For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is
[-1,0,1]
 (but there are many more correct answers).

     */
    public static int[] sumUpTo0(int n) {

        int[] result = new int[n];

        int sum = 0;
        for (int i = 0; i < n - 1; i++) { // (n-1) don't want to loop and assign the value to the last element of array. We assign it manually after the loop with negative sum (-sum)
            result[i] = i;
            sum += i;
        }
        result[n - 1] = -sum;
        return result;

    }

    public static void main(String[] args) {
      int   arr [] = {2,3,4};
        System.out.println(Arrays.toString(sumUpTo0(3)));
    }


    }
