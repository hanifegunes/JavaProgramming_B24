package GroupSix.Practice.week_2;

import java.util.Arrays;

public class Sorting2 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(method1(arr)));

    }

    public static int [] method1(int[] num) {

        int [] newNum = new int[num.length];
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                if (num[i] > num[j]) {
                  // newNum[i] =num[i];
                   newNum[i] = num[j];
                }

            }


        }
        return newNum;
    }
}