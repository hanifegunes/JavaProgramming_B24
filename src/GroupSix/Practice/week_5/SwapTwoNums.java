package GroupSix.Practice.week_5;

public class SwapTwoNums {

    public static void main(String[] args) {

        System.out.println("Before swapping");
        int x = 10;
        int y = 20;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        System.out.println("After swapping");
        x = x + y;// add 2.num, subsc 1. num== get 2num in the 1. place
        y = x - y;
        x = x - y;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
    }


}




/*
-- Swap Numbers
Swap two variable' values without using a third variable

 */
