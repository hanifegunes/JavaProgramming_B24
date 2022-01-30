package day27_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println("---- Table for " + i + " ----");

            for(int j = 1; j <= 10; j++){

                System.out.println(i + " x " + j + " = " + (i * j));
                //System.out.println(1 + " x " + j + " = " + (1 * j)); manual way
                //System.out.println(2 + " x " + j + " = " + (2 * j));

            }


        }


    }
}
