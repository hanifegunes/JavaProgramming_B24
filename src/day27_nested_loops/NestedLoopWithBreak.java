package day27_nested_loops;

public class NestedLoopWithBreak {
    public static void main(String[] args) {
        for ( int i = 1; i<= 3; i++){
            System.out.println("first");
            if (i == 2) { // this breaks the outer loop, so it only has one iteration
               break;      //that means we only see first, first, second


            }

        for (int j = 1; j<= 2; j++){

        if(j == 2){// this breaks the inner loop, so only one iteration of the inner loop is run
            System.out.println("pop");
        // break;
         }

        }}

        System.out.println("second");

    }
}
