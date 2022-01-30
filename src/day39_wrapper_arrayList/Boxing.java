package day39_wrapper_arrayList;

public class Boxing {
    public static void main(String[] args) {
        int i = 100;
        Integer i2 = i;
        System.out.println(i2);
        /*
        i is a primitive type;
        we store i into i2 which is wrapper class;
        primitive type -> wrapper class object
        autoboxing
         */

        Integer i3 = 600; // autoboxing
        int z = i3;   // unboxing. it goes from wrapper class to primitive type;
        int x = new Integer(40); // unboxing
        System.out.println(i3);
        System.out.println(z);
        System.out.println(x);


    }
}
