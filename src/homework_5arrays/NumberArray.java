package homework_5arrays;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {

      int[] num = new int[100];
      for(int i = 0; i< num.length; i++){
          num[i] = (i+1);
      }
        System.out.println(Arrays.toString(num));

    }
}
