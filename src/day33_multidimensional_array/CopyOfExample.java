package day33_multidimensional_array;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int [] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("-------------");

        a[0] = 100;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("------------");

        int [] c= {20, 30, 40};
        int [] d =Arrays.copyOf(c,3);
        int [] e =Arrays.copyOf(c,c.length+1);
        c[0] = 200;
        e[3] = 1000;
        System.out.println(Arrays.toString(e));//20, 30, 40,1000
        System.out.println("-----------");

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));




    }
}
