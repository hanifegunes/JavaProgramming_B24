package day15_switch;

public class NestedIf2 {
    public static void main(String[] args) {
        boolean b = true;// b true  c- true 1-2-3 will run  out put
        boolean c = false;// b false c true

        if (b) { // if b is false it will not run until else println(5) cod blocked between the braclets

            System.out.println(1);// b is true c false, 1,2,4

            if (!b) { // !true -> false
                System.out.println(3);
            } else {
                System.out.println(2);
            }

            if (c) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else {
            System.out.println(5);// b false it will come here and print 5

            if (4 > 5) {
                System.out.println(6);
            } else {
                System.out.println(7);// 1-2-4 will be out put b true c false


            }
        }
    }}